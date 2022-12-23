package event;

public class PublicEvent {
	private static PublicEvent instance;
	private EventImageView eventImageView;
	private EventChat eventChat;

	public static PublicEvent getInstance() {
		if (instance == null) {
			instance = new PublicEvent();
		}
		return instance;
	}

	private PublicEvent() {

	}

	public void addEventImageView(EventImageView event) {
		this.eventImageView = event;
	}

	public void addEventChat(EventChat e) {
		this.eventChat = e;

	}

	public EventImageView getEventImageView() {
		return eventImageView;
	}

	public EventChat getEventChat() {
		return eventChat;
	}
}
