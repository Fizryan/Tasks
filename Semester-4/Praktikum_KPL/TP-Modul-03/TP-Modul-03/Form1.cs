using System.Windows.Forms;

namespace TP_Modul_03
{
    public partial class MainFrame: Form
    {
        public MainFrame()
        {
            InitializeComponent();
        }

        private void clickBtn_MouseClick(object sender, MouseEventArgs e)           // ini action listener buat mouse kalau button di click
        {
            if (e.Button == MouseButtons.Left )                                     // kalau mouse di klik kiri
            {
                if (InputText.Text.Length > 0)                                      // kalau ada text di input
                {
                    OutputText.Text = "Halo " + InputText.Text;                     // keluarin output dari input text
                    InputText.Text = "";                                            // bersihin input
                } else
                {
                    OutputText.Text = "";                                           // bersihin Output
                    InputText.Text = "";                                            // bersihin input
                }
            }
        }
    }
}
