package ru.ssau.tk.PracticeTask5_1;

public class Settlement extends Location{
    private int settlement;
    private SettlementType type;

    public Settlement(){

    }
    public int getSettlement() {
        return settlement;
    }

    public void setSettlement(int settlement) {
        this.settlement = settlement;
    }

    public SettlementType getType() {
        return type;
    }

    public void setType(SettlementType type) {
        this.type = type;
    }

    public void setType(ru.ssau.tk.PracticeTask5_1.SettlementType city) {
    }
}
