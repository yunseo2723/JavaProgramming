
public class Controller {
	View _view;
	Model _model;
	
	public Controller() {
		_view = new View();
		_model = new Model();
	}
	
	public void run() {
		_view.printInputMsg();			
		_view.getInputData(_model);
		_view.printOutputMsg(_model.getSum(), _model.getSub());
	}
}
