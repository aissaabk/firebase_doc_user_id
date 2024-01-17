import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class FirebaseRepository {

    private FirebaseFirestore db;

    public FirebaseRepository() {
        // Initialize Firestore
        db = FirebaseFirestore.getInstance();
    }

    public void addUserData(String userId) {
        // Add initial data for each user
        DocumentReference userDocRef = db.collection("users").document(userId);
        userDocRef.set(new UserData(0, 0));
    }

    // Create a model class for user data
    public class UserData {
        private int currency;
        private int coins;

        public UserData(int currency, int coins) {
            this.currency = currency;
            this.coins = coins;
        }

        public int getCurrency() {
            return currency;
        }

        public int getCoins() {
            return coins;
        }
    }
}
