//Consider we want to implement a notification service 
//through email, SMS, and push notifications.

// we have an interface called Notification, and 
// three concrete classes are implementing the Notification interface.
//A factory class NotificationFactory is created to get a Notification object.

package factories_own_example;

public interface Notification {
    
	void notifyUser();
}