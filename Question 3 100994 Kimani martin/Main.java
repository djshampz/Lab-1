public class Main {
    public static void main(String[] args) {
        System.out.println("-----------Start of Report-------------");
        //Report of the First Building
        Building myFirstBuilding = new Building();
        myFirstBuilding.setNameBuilding("A");
        myFirstBuilding.setColour("Green");
        myFirstBuilding.setNumFloors(16);
        myFirstBuilding.setNumRoomsFloor(4);
        myFirstBuilding.printBuilding();
        System.out.println("------------End of Report-------------");
    }
}