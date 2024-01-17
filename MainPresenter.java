public class MainPresenter {

    private FirebaseRepository firebaseRepository;
    private MainView view;

    public MainPresenter(MainView view) {
        this.view = view;
        this.firebaseRepository = new FirebaseRepository();
    }

    public void addUserAndData(String userId) {
        firebaseRepository.addUserData(userId);
        view.showDataAddedMessage();
    }
}
