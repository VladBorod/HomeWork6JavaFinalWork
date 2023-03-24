import java.util.Objects;

public class NoteBook {
    private String model;
    private Double size;
    private String cpu;
    private String os;
    private Integer ram;
    private Integer ssd;


    public NoteBook(String name, Double size, String cpu, String os, Integer ram, Integer ssd) {
        this.model = name;
        this.size = size;
        this.cpu = cpu;
        this.os = os;
        this.ram = ram;
        this.ssd = ssd;

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteBook noteBook = (NoteBook) o;
        return model.equals(noteBook.model) && size.equals(noteBook.size) && cpu.equals(noteBook.cpu) && os.equals(noteBook.os) && ram.equals(noteBook.ram) && ssd.equals(noteBook.ssd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, size, cpu, os, ram, ssd);
    }

    @Override
    public String toString() {
        return "NoteBook: " +
                "model='" + model + '\'' +
                ", size=" + size +
                ", cpu='" + cpu + '\'' +
                ", os='" + os + '\'' +
                ", ram=" + ram + " Gb" +
                ", ssd=" + ssd + " Gb";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getSsd() {
        return ssd;
    }

    public void setSsd(Integer ssd) {
        this.ssd = ssd;
    }

//    public int compareTo(NoteBook n){
//        return model.compareTo(n.getModel());
//    }

}
