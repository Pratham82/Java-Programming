package Day17;

public class Address {
    int RoomNo;
    String State;
    String City;
    int PinCode;

    Address(int RoomNo, String State, String City, int PinCode){
        this.RoomNo = RoomNo;
        this.State = State;
        this.City = City;
        this.PinCode = PinCode;
    }

    @Override
    public String toString() {
        return "Address: " +
                "RoomNo=" + RoomNo +
                ", State='" + State + '\'' +
                ", City='" + City + '\'' +
                ", PinCode=" + PinCode +
                '}';
    }
}
