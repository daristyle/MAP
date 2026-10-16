import org.repository.*;
import org.service.Service;
import org.ui.*;

void main() {
    IRepository repository = new MemoryRepository();
    Service service = new Service(repository);
    IUI ui = new CUI(service);
    ui.start();
    ui.run();
}