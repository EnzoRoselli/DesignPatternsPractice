import models.entities.web.IWeb;
import models.entities.web.impl.JspForm;
import models.formfactories.IFormFactory;
import models.formfactories.impl.JavaFactory;

public class main {
    public static void main(String[] args) {
        IFormFactory javaFactory = new JavaFactory();

        IWeb jspForm = new JspForm();
        jspForm.show();
    }
}
