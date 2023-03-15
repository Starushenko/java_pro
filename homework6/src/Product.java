import java.time.LocalDate;
import java.util.*;

public class Product {

    private String type;
    private Integer price;
    private Integer saleRange;
    private LocalDate addedDate;
    private Integer taxNumber;
    private Integer addedYear;


    public Product(String type, Integer price) {
        this.type = type;
        this.price = price;
    }

    public Product(String type, Integer price, Integer saleRange) {
        this.type = type;
        this.price = price;
        this.saleRange = saleRange;
    }

    public Product(String type, Integer price, Integer saleRange, LocalDate addedDate) {
        this.type = type;
        this.price = price;
        this.saleRange = saleRange;
        this.addedDate = addedDate;
    }
    public Product(String type, Integer price, Integer saleRange, LocalDate addedDate, Integer taxNumber) {
        this.type = type;
        this.price = price;
        this.saleRange = saleRange;
        this.addedDate = addedDate;
        this.taxNumber = taxNumber;
    }
    public Product(String type, Integer price, Integer saleRange, Integer addedYear) {
        this.type = type;
        this.price = price;
        this.saleRange = saleRange;
        this.addedYear = addedYear;
    }

    public void taskOne(List<Product> incomeList, Integer minPrise) {
        incomeList.stream()
                .filter(s -> s.getPrice() > minPrise)
                .filter(s -> s.getType().equals("book"))
                .forEach(System.out::println);
    }

    public void taskTwo(List<Product> incomeList) {
        incomeList.stream()
                .filter(s -> s.getType().equals("book"))
                .map(s -> {
                    return new Product(
                            s.getType(),
                            s.getPrice() - (s.getSaleRange() * s.getPrice() / 100),
                            s.getSaleRange());
                })
                .forEach(System.out::println);
    }

    public void taskThree(List<Product> incomeList, String type) {
        try {
            System.out.println(
                    incomeList.stream()
                    .filter(s -> s.getType().equals(type))
                    .map(s -> {
                        return new Product(
                                s.getType(),
                                s.getPrice() - (s.getSaleRange() * s.getPrice() / 100),
                                s.getSaleRange());
                    }).min(Comparator.comparing(Product::getPrice))
            );
        } catch (Exception e){
            System.out.println("Product " +type+ " don't find");
        }
    }

    public void taskFour(List<Product> incomeList) {
        incomeList.stream()
                .sorted(Comparator.comparing(Product::getSaleRange).reversed())
                .limit(3)
                .forEach(System.out::println);
    }

    public int taskFive(List<Product> incomeList) {
      return   incomeList.stream()
                .map(s -> {
                    return new Product(
                            s.getType(),
                            s.getPrice(),
                            s.getSaleRange(),
                            s.getAddedDate().getYear()

                    );
                })
                .filter(s -> s.getPrice() <= 75)
                .filter(s -> s.getType().equals("book"))
                .filter(s-> s.getAddedYear().equals(2023))
                .mapToInt(Product::getPrice)
                .sum();

    }

    public Map<String, List<Product>> taskSix(List<Product> incomeList){
        Map<String, List<Product>> result = new HashMap<>();
        incomeList.stream()
                .forEach(s -> {
                    List<Product> listProduct = new ArrayList<>();
                    if (result.containsKey(s.getType())) {
                        listProduct = result.get(s.getType());
                    }
                    listProduct.add(s);
                    result.put(s.getType(), listProduct);
                });
        return result;
    }

    public String getType() {
        return type;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getSaleRange() {
        return saleRange;
    }

    public LocalDate getAddedDate() {
        return addedDate;
    }

    public Integer getTaxNumber() {
        return taxNumber;
    }
    public Integer getAddedYear() {
        return addedYear;
    }

    {
//    private  Product(String type, Integer price, Integer saleRange, Date addedDate, Integer taxNumber) {
//        this.type = type;
//        this.price = price;
//        this.saleRange = saleRange;
//        this.addedDate = addedDate;
//        this.taxNumber = taxNumber;
//    }
//
//    public static ProductBuilder builder(){
//       return new ProductBuilder();
//    }
//
//    static class ProductBuilder{
//        private String type;
//        private Integer price;
//        private Integer saleRange;
//        private Date addedDate;
//        private Integer taxNumber;
//
//        public ProductBuilder type(String type){
//            this.type = type;
//            return this;
//        }
//        public ProductBuilder price(Integer price){
//            this.price = price;
//            return this;
//        }
//        public ProductBuilder saleRange(Integer saleRange){
//            this.saleRange = saleRange;
//            return this;
//        }
//        public ProductBuilder addedDate(Date addedDate){
//            this.addedDate = addedDate;
//            return this;
//        }
//        public ProductBuilder taxNumber(Integer taxNumber){
//            this.taxNumber = taxNumber;
//            return this;
//        }
//
//        public Product build(){
//            return new Product(this.type,this.price,this.saleRange,this.addedDate,this.taxNumber);
//        }
//    }
//
    }

    @Override
    public String toString() {
        return "Product{" +
               "type='" + type + '\'' +
               ", price=" + price +
               ", saleRange=" + saleRange +
               ", addedDate=" + addedDate +
               ", taxNumber=" + taxNumber +
               '}';
    }


}
