public class StatisticsDisplay implements Observer, DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	private WeatherData weatherData;

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	if(temp > this.maxTemp){
		this.maxTemp = temp;
	}
	if(temp < this.minTemp){
		this.minTemp = temp;
	}
	this.tempSum += temp;
	numReadings++;
	display();

	public void update(float temp, float humidity, float pressure) {
		
		display();
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}
}
