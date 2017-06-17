package linearFunctions;
public class LinearFunction implements LinearFunctionMethods {
	
	//y=mx+b [slope(m), y-intercept(b)]
	//root represents x-intercept
	
	public LinearFunction(double sl, double YInt)
	{
		slope = sl;
		YIntercept = YInt;
	}
	public double getSlope()
	{
		return slope;
	}
	public double getYIntercept()
	{
		return YIntercept;
	}
	public double getRoot()
	{
		return ((0-YIntercept)/slope);
	}
	public double getYValue(double x)
	{
		return (slope*x) + YIntercept;
	}
	public double getXValue(double y)
	{
		return((y - YIntercept) / slope);
	}
	double slope;
	double YIntercept;
}
