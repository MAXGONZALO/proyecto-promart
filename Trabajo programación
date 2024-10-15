import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormOperaciones extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JButton Operar;
    private JTextField textField3;
    private JPanel PanelOperaiones;
    private JRadioButton prímeroSegundoRadioButton;
    private JRadioButton segundoPrímeroRadioButton;
    private JCheckBox redondearA2DecimalesCheckBox;

    public FormOperaciones (){
        setContentPane(PanelOperaiones);

        setTitle("Formulario para la operar 2 números");
        setSize(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        comboBox1.addItem("Sumar");
        comboBox1.addItem("Restar");
        comboBox1.addItem("Multiplicar");
        comboBox1.addItem("Dividir");

        Operar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x,y,r;

                x=Double.parseDouble(textField1.getText());
                y=Double.parseDouble(textField2.getText());
                r=0;

                ButtonGroup group = new ButtonGroup();
                group.add(prímeroSegundoRadioButton);
                group.add(segundoPrímeroRadioButton);


                String OperacionCombo=(String) comboBox1.getSelectedItem();

                switch (OperacionCombo){
                    case "Sumar":
                        r=x+y;
                        break;
                    case "Restar":
                        if (prímeroSegundoRadioButton.isSelected()){
                            r=x-y;
                        }else {
                            r=y-x;
                        }
                        break;
                    case "Multiplicar":
                        r=x*y;
                        break;
                    case "Dividir":
                        if (prímeroSegundoRadioButton.isSelected()){
                            r=x/y;
                        }else {
                            r=y/x;
                        }
                        break;
                }

                if (redondearA2DecimalesCheckBox.isSelected()){
                    String result= String.format("%.2f",r);
                    textField3.setText(result);
                }else
                    textField3.setText(Double.toString(r));
            }
        });


    }
    public static void main (String[] ergs){
        new FormOperaciones();
    }
}
