public class MainActivity extends AppCompatActivity implements MainView {

    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(this);

        // Replace "userId123" with the actual user ID
        presenter.addUserAndData("userId123");
    }

    @Override
    public void showDataAddedMessage() {
        Toast.makeText(this, "Data added successfully!", Toast.LENGTH_SHORT).show();
    }
}
