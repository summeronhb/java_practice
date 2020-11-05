package sec09.getter_setter;

public class Car {
	
		private int speed;
		private boolean stop;
		
		public int getSpeed() {
			return speed;
		}
		
		public double getSpeed_mile() {
			double km = speed *1.6;
			return km;
		}
		
		public void setSpeed(int speed) {
			if(speed<0) {
				this.speed = 0;
				return;
			}else {
				this.speed = speed;
			}
		}
		
		public boolean isStop() {
			return stop;
		}
		
		public void setStop(boolean stop) {
			this.stop = stop;
			this.speed = 0;
		}
	}
	
	

