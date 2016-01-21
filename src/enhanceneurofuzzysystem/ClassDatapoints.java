package enhanceneurofuzzysystem;

public class ClassDatapoints {

    private String className;
    private Double datapoint;

    public ClassDatapoints(String clas, Double val){
       this.className = clas;
       this.datapoint = val;
    }
    
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Double getDatapoint() {
        return datapoint;
    }

    public void setDatapoint(Double datapoint) {
        this.datapoint = datapoint;
    }

    public String toString(){
        return className+"  "+datapoint;
    }
}