package action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class CalculateAction extends ActionSupport {
	private String num1;
	private String num2;
	private String operation;
	private double result;
	public String getNum1() {
		return num1;
	}
	public void setNum1(String num1) {
		this.num1 = num1;
	}
	public String getNum2() {
		return num2;
	}
	public void setNum2(String num2) {
		this.num2 = num2;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	@Override
	public String execute(){
		double num3=0;
		double num4=0;
			try{
				num3=Double.parseDouble(num1);
				num4=Double.parseDouble(num2);
			}catch(Exception e){
				this.addActionError("ֻ���������֡�");
				e.printStackTrace();
				return "fail";
			}
			if(operation.equals("��")){
				result=num3+num4;
			}else if(operation.equals("��")){
				result=num3-num4;
			}else if(operation.equals("��")){
				result=num3*num4;
			}else if(operation.equals("��")){
				if(num4==0){
					this.addFieldError("num2", "��������Ϊ�㣡");
					return "fail";
				}else{
					result=num3/num4;
				}
			}
			return "success";
			
	}
}
