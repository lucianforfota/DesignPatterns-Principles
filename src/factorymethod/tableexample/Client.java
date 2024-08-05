package factorymethod.tableexample;

public class Client {

    public static void main(String[] args) {
        TableFactory tableFactory = new TableFactory();
        Table table = tableFactory.createTable("office");
        Table table2 = tableFactory.createTable("office");
        System.out.println(table2 instanceof OfficeTable);
    }
}
