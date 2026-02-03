public class Main {
    public static void main(String[] args) {
        UserManager manager = new UserManager();
        manager.addUser(new User("Ivan", "ivan@mail.com", "Admin"));
        manager.addUser(new User("Sanya", "sanya@mail.com", "User"));

        System.out.println("Список после добавления:");
        manager.printUsers();
        manager.updateUser("ivan@mail.com", "Ivan The Great", "SuperAdmin");
        manager.removeUser("sanya@mail.com");
        System.out.println("\nИтоговый список:");
        manager.printUsers();
    }
}
