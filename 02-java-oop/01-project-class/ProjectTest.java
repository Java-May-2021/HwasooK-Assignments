public class ProjectTest {
    public static void main(String[] args) {
        Project p1 = new Project();
        Project p2 = new Project("Java");
        Project p3 = new Project("Web Fundamental", "Web Fun Dojo", 500);
        System.out.println(p1.ElevatorPitch());
        System.out.println(p2.ElevatorPitch());
        System.out.println(p3.ElevatorPitch());

        p1.setName("Java");
        p1.setDescription("Java Dojo");
        p1.setCost(4000.54);
        System.out.println(p1.ElevatorPitch());

        p2.setDescription("Part time stack");
        p2.setCost(3152.00);
        System.out.println(p2.ElevatorPitch());

        Portfolio PL = new Portfolio();
        PL.showPortfolio();
    }
}


