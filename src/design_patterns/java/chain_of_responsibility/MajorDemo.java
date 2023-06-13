package design_patterns.java.chain_of_responsibility;

public class MajorDemo extends Manager {
    protected MajorDemo(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if(request.getRequestType() == "请假" && request.getNumber() <= 5) {
            System.out.println(name + "：" + request.getRequestContent() + " 数量" + request.getNumber() + " 被批准" );
        }else {
            if(superior != null) {
                superior.requestApplications(request);
            }
        }
    }
}
