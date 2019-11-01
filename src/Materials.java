
import java.io.PrintWriter;
import java.util.ArrayList;

public abstract class Materials implements Comparable<Materials> {

    protected ArrayList<Borrower> borrowers = new ArrayList<>();
    protected boolean available = true;
    protected String title;

    public String getTitle() {
        return title;
    }

    public void addNewBorrower(Borrower b) {
        borrowers.add(b);
    }

    public abstract boolean isAvailable();

    public abstract void borrow();

    public void getItemOwners(PrintWriter output) {
        if (borrowers.size() > 0) {
            for (int i = 0; i < borrowers.size(); i++) {
                if (i == 0) {
                    output.print(" was borrowed by " + borrowers.get(i).getName());
                }
                if (borrowers.size() > 1 && i > 0) {
                    output.print(", " + borrowers.get(i).getName());
                }
            }
            
        } else {
            output.println("** No one Ownes this item!\r\n");
        }

    }

    public void ReturnItem(PrintWriter output, int ID, int actualBorrowDuration) {
        this.available = true;
        if (borrowers.size() > 0) {
            for (int i = 0; i < borrowers.size(); i++) {
                if (borrowers.get(i).getId() == ID) {

                    borrowers.get(i).setActualBorrowDuration(actualBorrowDuration);
                    output.println(borrowers.get(i).getName() + " returned " + getTitle());
                }
            }
        }
        output.println();
    }

    @Override
    public int compareTo(Materials o) {

        return getTitle().compareTo(o.getTitle());

    }

}
