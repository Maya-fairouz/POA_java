package exo2;

public class NoteException extends Exception {
			float note;

			public NoteException(float note) {
			this.note = note;
			}

			@Override
			public String getMessage() {
			// TODO Auto-generated method stub
			return note + " n'est pas une note valide";
			

    }
}
