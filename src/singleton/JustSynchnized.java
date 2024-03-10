package singleton;


public class JustSynchnized {


		
		public static volatile JustSynchnized uniqueInstance;
		
		private JustSynchnized() {}
		
		public static  JustSynchnized getInstance() {
			if(uniqueInstance == null) {
				synchronized (JustSynchnized.class) {
					if(uniqueInstance==null) {
						uniqueInstance = new JustSynchnized();

					}
				}
			}
			return uniqueInstance;
		}

		
	
}
