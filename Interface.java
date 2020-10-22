package cadastro;

import cadastro.socket.verificaDoc;
import cadastro.socket.verificaDocServer;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;



public class Interface extends javax.swing.JFrame {
    
    DataTM tableModel = new DataTM();    
    Account a = new Account("", 0, "", "", "", "");
    
    //Contador setado para incrementar os numeros de conta criados
    int contador = 0; 
    
    //Captura Data Atual
    Date data = new Date();
    String dataString = "dd/MM/yyyy";
    SimpleDateFormat spd = new SimpleDateFormat(dataString);
    DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL, new Locale("pt", "BR"));
    String dataExtenso = formatador.format(data);
    
    public Interface() {
        initComponents();
        tableData.setModel(tableModel);
        
        //Personalização dos tamanhos de coluna da tabela
        TableColumn col = tableData.getColumnModel().getColumn(0);
        col.setPreferredWidth(50);
        
        col = tableData.getColumnModel().getColumn(1);
        col.setPreferredWidth(30);
        
        col = tableData.getColumnModel().getColumn(2);
        col.setPreferredWidth(180);
        
        col = tableData.getColumnModel().getColumn(3);
        col.setPreferredWidth(180);
        
        col = tableData.getColumnModel().getColumn(4);
        col.setPreferredWidth(100);
        
        col = tableData.getColumnModel().getColumn(5);
        col.setPreferredWidth(40);
        
        col = tableData.getColumnModel().getColumn(6);
        col.setPreferredWidth(100);
        
        col = tableData.getColumnModel().getColumn(7);
        col.setPreferredWidth(100);
        
        col = tableData.getColumnModel().getColumn(8);
        col.setPreferredWidth(180);
        
        col = tableData.getColumnModel().getColumn(9);
        col.setPreferredWidth(50);
        
        col = tableData.getColumnModel().getColumn(10);
        col.setPreferredWidth(80);
        
        col = tableData.getColumnModel().getColumn(11);
        col.setPreferredWidth(70);
        
        col = tableData.getColumnModel().getColumn(12);
        col.setPreferredWidth(100);

        col = tableData.getColumnModel().getColumn(13);
        col.setPreferredWidth(100);
        
        slGenero.add(slMasc);
        slGenero.add(slFem);
        lbDataHora.setText(dataExtenso);
        
        //Inicia a função de verificação a partir das threads e socket
        verificaDoc c = new verificaDoc(tfCpf, tableModel);
        tfCpf.addFocusListener(c);
        verificaDocServer vf = new verificaDocServer(c);
        vf.start();     
        
        //Inicializa dados do banco no formulário
        tfAgencia.setText("1484");
        tfAbertura.setText(spd.format(data));
        tfSaldo.setText("R$ " + Float.toString(a.getSaldo()));
    }   
        
    //set e reset color
    public void setColor(JButton bt){
        bt.setBackground(new Color(253,253,253));
    }
    public void resetColor(JButton bt){
        bt.setBackground(new Color(86,85,84));
    }
    
    
    //Verifica se o usuário preencheu todos os dados 
    public boolean verifText(){                     
        if( 
            tfNome.getText().equals("") ||
            tfEmail.getText().equals("") ||
            tfCelular.getText().equals("") ||
            tdNasc.getText().equals("") || 
            tfSenha.getText().equals("") || 
            tfCpf.getText().equals("") || 
            tfRg.getText().equals("") || 
            tfLogin.getText().equals("") ||
            tfRua.getText().equals("") || 
            tfNumero.getText().equals("") || 
            tfCep.getText().equals("") || 
            tfCidade.getText().equals("") || 
            tfEstado.getText().equals("") ||
            !chBox.isSelected()){
            JOptionPane.showMessageDialog(null, "Verifique se você preencheu todos os campos!");
            return false;
        }else if((slFem.isSelected() && slMasc.isSelected()) || (!slFem.isSelected() && !slMasc.isSelected())){
            JOptionPane.showMessageDialog(null, "Selecione o Sexo!");
            return false;
        }else{
            return true;
        }
    }
    
    public void clearData(){
        tfNome.setText("");
        tfEmail.setText("");
        tfCelular.setText(""); 
        tfCpf.setText("");
        tfRg.setText("");
        tfLogin.setText("");
        tdNasc.setText("");
        tfSenha.setText("");
        tfRua.setText("");
        tfNumero.setText("");
        tfComplemento.setText("");
        tfCep.setText("");
        tfCidade.setText("");
        tfEstado.setText("");
        chBox.setSelected(false);       
        slGenero.clearSelection();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        slGenero = new javax.swing.ButtonGroup();
        dialogoBox = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btAceito = new javax.swing.JButton();
        Side = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btPesquisa = new javax.swing.JButton();
        btCadastro = new javax.swing.JButton();
        btHome = new javax.swing.JButton();
        Background = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        lbContador = new javax.swing.JLabel();
        lbDataHora = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        table = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        buscar = new javax.swing.JTextField();
        btRemove = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cadastro = new javax.swing.JPanel();
        dadosPesoais = new javax.swing.JPanel();
        tfNome = new javax.swing.JTextField();
        slFem = new javax.swing.JRadioButton();
        slMasc = new javax.swing.JRadioButton();
        tfEmail = new javax.swing.JTextField();
        tfCpf = new javax.swing.JFormattedTextField();
        tfRg = new javax.swing.JFormattedTextField();
        tfLogin = new javax.swing.JTextField();
        tfSenha = new javax.swing.JPasswordField();
        tfCelular = new javax.swing.JFormattedTextField();
        tdNasc = new javax.swing.JFormattedTextField();
        Account = new javax.swing.JPanel();
        tfAgencia = new javax.swing.JTextField();
        tfContaNum = new javax.swing.JTextField();
        selTipo = new javax.swing.JComboBox<>();
        tfAbertura = new javax.swing.JTextField();
        tfSaldo = new javax.swing.JTextField();
        Address = new javax.swing.JPanel();
        tfCep = new javax.swing.JFormattedTextField();
        tfEstado = new javax.swing.JTextField();
        tfComplemento = new javax.swing.JTextField();
        tfCidade = new javax.swing.JTextField();
        tfNumero = new javax.swing.JTextField();
        tfRua = new javax.swing.JTextField();
        btAdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        chBox = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();

        dialogoBox.setTitle("Política de privacidade.");
        dialogoBox.setMinimumSize(new java.awt.Dimension(1024, 768));

        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 768));

        jScrollPane2.setMaximumSize(new java.awt.Dimension(1024, 680));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(1024, 680));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(1024, 680));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Política de privacidade para mybank.\n\nTodas as suas informações pessoais recolhidas, serão usadas para o ajudar a tornar a sua visita no nosso site o mais produtiva e agradável \npossível.\n\nA garantia da confidencialidade dos dados pessoais dos utilizadores do nosso site é importante para o mybank..\n\nTodas as informações pessoais relativas a membros, assinantes, clientes ou visitantes que usem o mybank. serão tratadas em concordância \ncom a Lei da Proteção de Dados Pessoais de 26 de outubro de 1998 (Lei n.º 67/98).\n\nA informação pessoal recolhida pode incluir o seu nome, e-mail, número de telefone e/ou telemóvel, morada, data de nascimento e/ou outros.\n\nO uso do mybank. pressupõe a aceitação deste Acordo de privacidade. A equipa do mybank. reserva-se ao direito de alterar este acordo \nsem aviso prévio. Deste modo, recomendamos que consulte a nossa política de privacidade com regularidade de forma a estar sempre atualizado.\n\nOs anúncios\nTal como outros websites, coletamos e utilizamos informação contida nos anúncios. A informação contida nos anúncios, inclui o \nseu endereço IP (Internet Protocol), o seu ISP (Internet Service Provider, como o Sapo, Clix, ou outro), o browser que utilizou \nao visitar o nosso website (como o Internet Explorer ou o Firefox), o tempo da sua visita e que páginas visitou dentro do nosso website.\n\nCookie DoubleClick Dart\nO Google, como fornecedor de terceiros, utiliza cookies para exibir anúncios no nosso website;\n\nCom o cookie DART, o Google pode exibir anúncios com base nas visitas que o leitor fez a outros websites na Internet;\n\nOs utilizadores podem desativar o cookie DART visitando a Política de privacidade da rede de conteúdo e dos anúncios do Google.\n\nOs Cookies e Web Beacons\nUtilizamos cookies para armazenar informação, tais como as suas preferências pessoas quando visita o nosso website. Isto poderá \nincluir um simples popup, ou uma ligação em vários serviços que providenciamos, tais como fóruns.\n\nEm adição também utilizamos publicidade de terceiros no nosso website para suportar os custos de manutenção. Alguns destes \npublicitários, poderão utilizar tecnologias como os cookies e/ou web beacons quando publicitam no nosso website, o que fará \ncom que esses publicitários (como o Google através do Google AdSense) também recebam a sua informação pessoal, como o endereço IP, \no seu ISP, o seu browser, etc. Esta função é geralmente utilizada para geotargeting (mostrar publicidade de Lisboa apenas aos \nleitores oriundos de Lisboa por ex.) ou apresentar publicidade direcionada a um tipo de utilizador (como mostrar publicidade de \nrestaurante a um utilizador que visita sites de culinária regularmente, por ex.).\n\nVocê detém o poder de desligar os seus cookies, nas opções do seu browser, ou efetuando alterações nas ferramentas de programas \nAnti-Virus, como o Norton Internet Security. No entanto, isso poderá alterar a forma como interage com o nosso website, \nou outros websites. Isso poderá afetar ou não permitir que faça logins em programas, sites ou fóruns da nossa e de outras redes.\n\nLigações a Sites de terceiros\nO mybank. possui ligações para outros sites, os quais, a nosso ver, podem conter informações / ferramentas úteis para os \nnossos visitantes. A nossa política de privacidade não é aplicada a sites de terceiros, pelo que, caso visite outro site \na partir do nosso deverá ler a politica de privacidade do mesmo.\n\nNão nos responsabilizamos pela política de privacidade ou conteúdo presente nesses mesmos sites.");
        jTextArea1.setMaximumSize(new java.awt.Dimension(1024, 680));
        jTextArea1.setMinimumSize(new java.awt.Dimension(1024, 680));
        jTextArea1.setPreferredSize(new java.awt.Dimension(1024, 680));
        jScrollPane2.setViewportView(jTextArea1);

        btAceito.setBackground(new java.awt.Color(153, 255, 153));
        btAceito.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btAceito.setForeground(new java.awt.Color(86, 85, 84));
        btAceito.setText("CONCORDO");
        btAceito.setBorderPainted(false);
        btAceito.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btAceito.setMultiClickThreshhold(10000L);
        btAceito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAceitoMouseClicked(evt);
            }
        });
        btAceito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAceitoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btAceito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1008, Short.MAX_VALUE))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btAceito, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogoBoxLayout = new javax.swing.GroupLayout(dialogoBox.getContentPane());
        dialogoBox.getContentPane().setLayout(dialogoBoxLayout);
        dialogoBoxLayout.setHorizontalGroup(
            dialogoBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dialogoBoxLayout.setVerticalGroup(
            dialogoBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("myBank - Cadastro e busca de usuários v1.0\n");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setName("myBank.com"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 768));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        Side.setBackground(new java.awt.Color(86, 85, 84));
        Side.setMaximumSize(new java.awt.Dimension(200, 1080));
        Side.setMinimumSize(new java.awt.Dimension(200, 768));
        Side.setPreferredSize(new java.awt.Dimension(200, 768));
        Side.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Gadugi", 1, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(253, 253, 253));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("myBank");
        Side.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 60));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 247));
        jLabel8.setText(".com");
        Side.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 120, 110));

        btPesquisa.setBackground(new java.awt.Color(86, 85, 84));
        btPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastro/images/iconfinder_search_322497 (1).png"))); // NOI18N
        btPesquisa.setText("PESQUISAR");
        btPesquisa.setBorder(null);
        btPesquisa.setFocusPainted(false);
        btPesquisa.setIconTextGap(20);
        btPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btPesquisaMouseClicked(evt);
            }
        });
        Side.add(btPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 200, 70));

        btCadastro.setBackground(new java.awt.Color(86, 85, 84));
        btCadastro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastro/images/iconfinder_detail-information-menu-data_2075825.png"))); // NOI18N
        btCadastro.setText("CADASTRO");
        btCadastro.setBorder(null);
        btCadastro.setFocusPainted(false);
        btCadastro.setIconTextGap(20);
        btCadastro.setMultiClickThreshhold(10000L);
        btCadastro.setName(""); // NOI18N
        btCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCadastroMouseClicked(evt);
            }
        });
        Side.add(btCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 200, 70));

        btHome.setBackground(new java.awt.Color(253, 253, 253));
        btHome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastro/images/iconfinder_65_171424.png"))); // NOI18N
        btHome.setText("HOMEPAGE");
        btHome.setBorder(null);
        btHome.setFocusPainted(false);
        btHome.setIconTextGap(20);
        btHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btHomeMouseClicked(evt);
            }
        });
        Side.add(btHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 70));

        Background.setAlignmentX(0.0F);
        Background.setAlignmentY(0.0F);
        Background.setMaximumSize(new java.awt.Dimension(1920, 1080));
        Background.setMinimumSize(new java.awt.Dimension(824, 768));
        Background.setPreferredSize(new java.awt.Dimension(824, 768));
        Background.setRequestFocusEnabled(false);
        Background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BackgroundMouseMoved(evt);
            }
        });
        Background.setLayout(new java.awt.CardLayout());

        home.setBackground(new java.awt.Color(253, 253, 253));
        home.setAlignmentX(0.0F);
        home.setAlignmentY(0.0F);
        home.setMaximumSize(new java.awt.Dimension(1920, 1080));
        home.setMinimumSize(new java.awt.Dimension(824, 768));
        home.setName(""); // NOI18N
        home.setPreferredSize(new java.awt.Dimension(824, 768));

        lbContador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbContador.setForeground(new java.awt.Color(86, 85, 84));
        lbContador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastro/images/users-icon.png"))); // NOI18N
        lbContador.setText("0 Usuários cadastrados");

        lbDataHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbDataHora.setForeground(new java.awt.Color(86, 85, 84));
        lbDataHora.setText("Dia e data");

        jLabel1.setBackground(new java.awt.Color(253, 253, 253));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastro/images/miconta_1.png"))); // NOI18N

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(lbContador)
                .addGap(116, 116, 116)
                .addComponent(lbDataHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(128, 128, 128))
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbContador, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        Background.add(home, "card2");

        table.setBackground(new java.awt.Color(253, 253, 253));
        table.setMaximumSize(new java.awt.Dimension(1920, 1080));
        table.setMinimumSize(new java.awt.Dimension(824, 768));
        table.setName(""); // NOI18N
        table.setPreferredSize(new java.awt.Dimension(824, 768));

        jPanel2.setBackground(new java.awt.Color(253, 253, 253));
        jPanel2.setMinimumSize(new java.awt.Dimension(774, 768));
        jPanel2.setPreferredSize(new java.awt.Dimension(774, 768));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1000, 402));

        tableData.setAutoCreateRowSorter(true);
        tableData.setBackground(new java.awt.Color(255, 255, 250));
        tableData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableData.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Email", "Celular", "Sexo", "RG", "CPF", "Rua", "Número", "Complemento", "CEP", "Cidade", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableData.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableData.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableData.setFillsViewportHeight(true);
        tableData.setInheritsPopupMenu(true);
        tableData.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tableData.setMaximumSize(new java.awt.Dimension(1920, 1080));
        tableData.setPreferredSize(new java.awt.Dimension(1360, 550));
        tableData.setRowHeight(25);
        tableData.setShowGrid(false);
        tableData.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableData);

        buscar.setBackground(new java.awt.Color(249, 247, 247));
        buscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscar.setToolTipText("");
        buscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        btRemove.setBackground(new java.awt.Color(86, 85, 84));
        btRemove.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btRemove.setForeground(new java.awt.Color(255, 255, 255));
        btRemove.setText("EXCLUIR");
        btRemove.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btRemove.setBorderPainted(false);
        btRemove.setFocusPainted(false);
        btRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoveActionPerformed(evt);
            }
        });

        btBuscar.setBackground(new java.awt.Color(162, 162, 161));
        btBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btBuscar.setText("BUSCAR");
        btBuscar.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true)));
        btBuscar.setBorderPainted(false);
        btBuscar.setFocusPainted(false);
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(86, 85, 84));
        jLabel5.setText("PESQUISA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tableLayout = new javax.swing.GroupLayout(table);
        table.setLayout(tableLayout);
        tableLayout.setHorizontalGroup(
            tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        tableLayout.setVerticalGroup(
            tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        Background.add(table, "card3");

        cadastro.setBackground(new java.awt.Color(253, 253, 253));
        cadastro.setAlignmentX(0.0F);
        cadastro.setAlignmentY(0.0F);
        cadastro.setMaximumSize(new java.awt.Dimension(1920, 1080));
        cadastro.setMinimumSize(new java.awt.Dimension(824, 768));
        cadastro.setName(""); // NOI18N
        cadastro.setPreferredSize(new java.awt.Dimension(824, 768));
        cadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastroMouseClicked(evt);
            }
        });

        dadosPesoais.setBackground(new java.awt.Color(249, 247, 247));
        dadosPesoais.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "DADOS PESSOAIS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(37, 38, 39))); // NOI18N
        dadosPesoais.setMaximumSize(new java.awt.Dimension(824, 768));
        dadosPesoais.setMinimumSize(new java.awt.Dimension(824, 768));
        dadosPesoais.setName(""); // NOI18N

        tfNome.setBackground(new java.awt.Color(253, 253, 253));
        tfNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfNome.setToolTipText("ex.: João da Silva");
        tfNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOME COMPLETO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(37, 38, 39))); // NOI18N

        slFem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        slFem.setForeground(new java.awt.Color(37, 38, 39));
        slFem.setText("FEMININO");
        slFem.setAlignmentY(0.0F);
        slFem.setContentAreaFilled(false);
        slFem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        slFem.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        slFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slFemActionPerformed(evt);
            }
        });

        slMasc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        slMasc.setForeground(new java.awt.Color(37, 38, 39));
        slMasc.setText("MASCULINO");
        slMasc.setToolTipText("");
        slMasc.setAlignmentY(0.0F);
        slMasc.setContentAreaFilled(false);
        slMasc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        slMasc.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        tfEmail.setBackground(new java.awt.Color(253, 253, 253));
        tfEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfEmail.setToolTipText("ex.: mail@mail.com");
        tfEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EMAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(37, 38, 39))); // NOI18N

        tfCpf.setBackground(new java.awt.Color(253, 253, 253));
        tfCpf.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CPF", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(37, 38, 39))); // NOI18N
        try {
            tfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCpf.setToolTipText("ex.: 000.000.000-00");
        tfCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCpfFocusGained(evt);
            }
        });
        tfCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCpfActionPerformed(evt);
            }
        });

        tfRg.setBackground(new java.awt.Color(253, 253, 253));
        tfRg.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RG", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(37, 38, 39))); // NOI18N
        try {
            tfRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfRg.setToolTipText("ex.: 00.000.000-0");
        tfRg.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfRg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfRg.setSelectionColor(new java.awt.Color(57, 169, 219));
        tfRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRgActionPerformed(evt);
            }
        });

        tfLogin.setBackground(new java.awt.Color(253, 253, 253));
        tfLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfLogin.setToolTipText("ex.: mail@mail.com");
        tfLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LOGIN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(37, 38, 39))); // NOI18N
        tfLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfLoginFocusLost(evt);
            }
        });
        tfLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLoginActionPerformed(evt);
            }
        });
        tfLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfLoginKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfLoginKeyTyped(evt);
            }
        });

        tfSenha.setBackground(new java.awt.Color(253, 253, 253));
        tfSenha.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        tfSenha.setToolTipText("");
        tfSenha.setAlignmentX(0.0F);
        tfSenha.setAlignmentY(0.0F);
        tfSenha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SENHA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(37, 38, 39))); // NOI18N
        tfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSenhaActionPerformed(evt);
            }
        });
        tfSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSenhaKeyPressed(evt);
            }
        });

        tfCelular.setBackground(new java.awt.Color(253, 253, 253));
        tfCelular.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CELULAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(37, 38, 39))); // NOI18N
        try {
            tfCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCelular.setToolTipText("ex.: (99) 99999999");
        tfCelular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCelularActionPerformed(evt);
            }
        });

        tdNasc.setBackground(new java.awt.Color(253, 253, 253));
        tdNasc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATA DE NASCIMENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(37, 38, 39))); // NOI18N
        try {
            tdNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tdNasc.setToolTipText("ex.: 01/01/1999");
        tdNasc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tdNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdNascActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dadosPesoaisLayout = new javax.swing.GroupLayout(dadosPesoais);
        dadosPesoais.setLayout(dadosPesoaisLayout);
        dadosPesoaisLayout.setHorizontalGroup(
            dadosPesoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPesoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosPesoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosPesoaisLayout.createSequentialGroup()
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dadosPesoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(slMasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(slFem, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosPesoaisLayout.createSequentialGroup()
                        .addGroup(dadosPesoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(dadosPesoaisLayout.createSequentialGroup()
                                .addComponent(tfRg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dadosPesoaisLayout.createSequentialGroup()
                                .addComponent(tfLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dadosPesoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dadosPesoaisLayout.createSequentialGroup()
                                .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tdNasc)))))
                .addContainerGap())
        );
        dadosPesoaisLayout.setVerticalGroup(
            dadosPesoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPesoaisLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(dadosPesoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dadosPesoaisLayout.createSequentialGroup()
                        .addComponent(slMasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slFem)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPesoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tdNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPesoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Account.setBackground(new java.awt.Color(249, 247, 247));
        Account.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "CONTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(37, 38, 39))); // NOI18N
        Account.setMaximumSize(new java.awt.Dimension(0, 0));
        Account.setName(""); // NOI18N
        Account.setPreferredSize(new java.awt.Dimension(930, 185));

        tfAgencia.setEditable(false);
        tfAgencia.setBackground(new java.awt.Color(238, 238, 238));
        tfAgencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfAgencia.setToolTipText("");
        tfAgencia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AGÊNCIA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(37, 38, 39))); // NOI18N
        tfAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAgenciaActionPerformed(evt);
            }
        });

        tfContaNum.setEditable(false);
        tfContaNum.setBackground(new java.awt.Color(238, 238, 238));
        tfContaNum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfContaNum.setToolTipText("");
        tfContaNum.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(37, 38, 39))); // NOI18N
        tfContaNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfContaNumActionPerformed(evt);
            }
        });

        selTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selTipo.setMaximumRowCount(2);
        selTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONTA CORRENTE", "CONTA POUPANÇA", " " }));
        selTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selTipoActionPerformed(evt);
            }
        });

        tfAbertura.setEditable(false);
        tfAbertura.setBackground(new java.awt.Color(238, 238, 238));
        tfAbertura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfAbertura.setToolTipText("");
        tfAbertura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATA DE ABERTURA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(37, 38, 39))); // NOI18N
        tfAbertura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAberturaActionPerformed(evt);
            }
        });

        tfSaldo.setEditable(false);
        tfSaldo.setBackground(new java.awt.Color(238, 238, 238));
        tfSaldo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfSaldo.setToolTipText("");
        tfSaldo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SALDO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(37, 38, 39))); // NOI18N
        tfSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSaldoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AccountLayout = new javax.swing.GroupLayout(Account);
        Account.setLayout(AccountLayout);
        AccountLayout.setHorizontalGroup(
            AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(tfAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfContaNum, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        AccountLayout.setVerticalGroup(
            AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfContaNum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Address.setBackground(new java.awt.Color(249, 247, 247));
        Address.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ENDEREÇO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(37, 38, 39))); // NOI18N
        Address.setMaximumSize(new java.awt.Dimension(824, 768));
        Address.setMinimumSize(new java.awt.Dimension(824, 768));
        Address.setName(""); // NOI18N
        Address.setPreferredSize(new java.awt.Dimension(930, 185));

        tfCep.setBackground(new java.awt.Color(253, 253, 253));
        tfCep.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CEP", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(37, 38, 39))); // NOI18N
        try {
            tfCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCep.setToolTipText("ex.: 00000-000\n");
        tfCep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCepActionPerformed(evt);
            }
        });

        tfEstado.setBackground(new java.awt.Color(253, 253, 253));
        tfEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfEstado.setToolTipText("ex.: Rio Grande do Sul");
        tfEstado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ESTADO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(37, 38, 39))); // NOI18N
        tfEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfEstadoKeyTyped(evt);
            }
        });

        tfComplemento.setBackground(new java.awt.Color(253, 253, 253));
        tfComplemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfComplemento.setToolTipText("Apto");
        tfComplemento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COMPLEMENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(37, 38, 39))); // NOI18N
        tfComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfComplementoActionPerformed(evt);
            }
        });

        tfCidade.setBackground(new java.awt.Color(253, 253, 253));
        tfCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCidade.setToolTipText("ex.: Santa Maria");
        tfCidade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CIDADE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(37, 38, 39))); // NOI18N
        tfCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCidadeKeyTyped(evt);
            }
        });

        tfNumero.setBackground(new java.awt.Color(253, 253, 253));
        tfNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfNumero.setToolTipText("ex.: 1000");
        tfNumero.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NÚMERO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(37, 38, 39))); // NOI18N
        tfNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumeroActionPerformed(evt);
            }
        });
        tfNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNumeroKeyTyped(evt);
            }
        });

        tfRua.setBackground(new java.awt.Color(253, 253, 253));
        tfRua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfRua.setToolTipText("ex.: Avenida Roraima");
        tfRua.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RUA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(37, 38, 39))); // NOI18N
        tfRua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfRuaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout AddressLayout = new javax.swing.GroupLayout(Address);
        Address.setLayout(AddressLayout);
        AddressLayout.setHorizontalGroup(
            AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddressLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AddressLayout.createSequentialGroup()
                        .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCidade))
                    .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AddressLayout.createSequentialGroup()
                        .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfEstado))
                .addGap(55, 55, 55))
        );
        AddressLayout.setVerticalGroup(
            AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddressLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btAdd.setBackground(new java.awt.Color(245, 247, 73));
        btAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btAdd.setForeground(new java.awt.Color(86, 85, 84));
        btAdd.setText("CADASTRAR");
        btAdd.setBorderPainted(false);
        btAdd.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAddMouseClicked(evt);
            }
        });
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(86, 85, 84));
        jLabel2.setText("Li e concordo com os termos de política de privacidade.");

        chBox.setAlignmentY(0.0F);
        chBox.setContentAreaFilled(false);
        chBox.setEnabled(false);
        chBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(86, 85, 84));
        jLabel3.setText("Clique aqui para abrir o termo de política de privacidade.");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cadastroLayout = new javax.swing.GroupLayout(cadastro);
        cadastro.setLayout(cadastroLayout);
        cadastroLayout.setHorizontalGroup(
            cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastroLayout.createSequentialGroup()
                        .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dadosPesoais, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 792, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cadastroLayout.createSequentialGroup()
                                .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Account, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE))
                        .addGap(43, 43, 43))
                    .addGroup(cadastroLayout.createSequentialGroup()
                        .addComponent(chBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        cadastroLayout.setVerticalGroup(
            cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(dadosPesoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(Account, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(chBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74))
        );

        Background.add(cadastro, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Side, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Side, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCelularActionPerformed

    private void tfRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRgActionPerformed

    private void tfCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCpfActionPerformed

    private void btRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveActionPerformed

        if(tableData.getSelectedRow() != -1 && (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover esse usuário?") == 0)){
            tableModel.removeRow(tableData.getSelectedRow());
        }else if(tableData.getSelectedRow() == -1 ){
            JOptionPane.showMessageDialog(null, "Selecione um usuário para remover.");
        }
    }//GEN-LAST:event_btRemoveActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void slFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slFemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_slFemActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        TableRowSorter<DataTM> sorter;
        sorter = new TableRowSorter<DataTM>(tableModel);
        tableData.setRowSorter(sorter);
        
       //Exception criada para verificar se o campo de input da pesquisa nao está vazio!
        try{
            if(buscar.getText().equals("")){
                throw new Excecao(buscar.getText());
            }
        }catch(Excecao e){
            JOptionPane.showMessageDialog(null, "É preciso inserir algo na caixa de texto para fazer uma pesquisa!");
        }finally{
            sorter.setRowFilter(RowFilter.regexFilter(buscar.getText().trim()));
        }
        
        
    }//GEN-LAST:event_btBuscarActionPerformed

    private void tdNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdNascActionPerformed

    private void tfAberturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAberturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAberturaActionPerformed

    private void selTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selTipoActionPerformed

    }//GEN-LAST:event_selTipoActionPerformed

    private void tfContaNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContaNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfContaNumActionPerformed

    private void tfAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAgenciaActionPerformed

    }//GEN-LAST:event_tfAgenciaActionPerformed

    private void tfComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfComplementoActionPerformed

    private void tfCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCepActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
    }//GEN-LAST:event_formMouseMoved

    private void BackgroundMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMouseMoved

    }//GEN-LAST:event_BackgroundMouseMoved

    private void tfSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSaldoActionPerformed

    private void cadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroMouseClicked

    private void btPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPesquisaMouseClicked
        setColor(btPesquisa);
        resetColor(btCadastro);
        resetColor(btHome);
        
        Background.removeAll();
        Background.add(table);
        Background.repaint();
        Background.revalidate();
        
        
        
    }//GEN-LAST:event_btPesquisaMouseClicked

    private void btCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCadastroMouseClicked
        tfContaNum.setText(Integer.toString(contador + 37629));
        setColor(btCadastro);
        resetColor(btPesquisa);
        resetColor(btHome);
        
        Background.removeAll();
        Background.add(cadastro);
        Background.repaint();
        Background.revalidate();
        
    }//GEN-LAST:event_btCadastroMouseClicked

    private void btHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btHomeMouseClicked
        setColor(btHome);
        resetColor(btPesquisa);
        resetColor(btCadastro);
        Background.removeAll();
        Background.add(home);
        Background.repaint();
        Background.revalidate();
    
    }//GEN-LAST:event_btHomeMouseClicked

    private void tfCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCpfFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCpfFocusGained

    private void btAceitoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAceitoMouseClicked
        dialogoBox.dispose();
        chBox.setEnabled(true);
        chBox.setSelected(true);
    }//GEN-LAST:event_btAceitoMouseClicked

    private void btAceitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAceitoActionPerformed

    private void chBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chBoxActionPerformed
        
    }//GEN-LAST:event_chBoxActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed

    }//GEN-LAST:event_btAddActionPerformed

    private void btAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAddMouseClicked
        Account u = new Account(tfRua.getText(), Integer.parseInt(tfNumero.getText()), tfComplemento.getText(), tfCep.getText(), tfCidade.getText(),tfEstado.getText());
        u.setNome(tfNome.getText());
        u.setEmail(tfEmail.getText());
        u.setCelular(tfCelular.getText());
        u.setCpf(tfCpf.getText());
        u.setRg(tfRg.getText());
        u.setLogin(tfLogin.getText());
        u.setSenha(tfSenha.getText());
        u.setAgencia(tfAgencia.getText());
        u.setDataAbertura(tfAbertura.getText());
        u.setNumeroConta(Integer.parseInt(tfContaNum.getText()));
        
        //Seleciona entre CC e Cp
        if(selTipo.getSelectedItem() == "CONTA CORRENTE"){
            u.setTipo("CC");
        }else{
            u.setTipo("CP");
        }

        //Define Sexo a partir da opção selecionada
        if(slMasc.isSelected()){
            u.setSexo("M");
        }else{
            u.setSexo("F");
        }

        //Verrifica se todos os campos foram preenchidos e atualiza os dados de contagem de linha e usuários cadastrados.
        if(verifText()){
            
            //Add linha nova na tabela e na lista
            tableModel.addRow(u);
            
            //Contador de usuário cadastrados
            contador++;
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
            clearData();
            if(contador == 1){
                lbContador.setText(contador + " Usuário cadastrado");
            }else{
                lbContador.setText(contador + " Usuários cadastrados");
            }

            //Muda para o painel Home
            Background.removeAll();
            Background.add(home);
            Background.repaint();
            Background.revalidate();

            setColor(btHome);
            resetColor(btPesquisa);
            resetColor(btCadastro);
        }
     
    }//GEN-LAST:event_btAddMouseClicked
     
    private void tfLoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfLoginKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLoginKeyTyped

    private void tfLoginKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfLoginKeyReleased

    }//GEN-LAST:event_tfLoginKeyReleased

    private void tfLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLoginActionPerformed

    private void tfLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfLoginFocusLost
       String st = tfLogin.getText();
        for(int i=0; i< tableModel.data.size();i++){
            if(st.equalsIgnoreCase(tableModel.data.get(i).getLogin())){
                JOptionPane.showMessageDialog(null, "Esse login não está disponível. \nInsira outro e tente novamente.");
            }
        }
    }//GEN-LAST:event_tfLoginFocusLost

    private void tfLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfLoginFocusGained

    }//GEN-LAST:event_tfLoginFocusGained

    private void tfSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSenhaKeyPressed

    }//GEN-LAST:event_tfSenhaKeyPressed

    private void tfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSenhaActionPerformed

    }//GEN-LAST:event_tfSenhaActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

            dialogoBox.setVisible(true);
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void tfNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroActionPerformed

    private void tfNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumeroKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){           //permite apenas a entrada de numeros
            evt.consume();
        }
    }//GEN-LAST:event_tfNumeroKeyTyped

    private void tfRuaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfRuaKeyTyped
        if(Character.isDigit(evt.getKeyChar())){ //permite apenas a entrada de letras
                evt.consume();
            }
    }//GEN-LAST:event_tfRuaKeyTyped

    private void tfCidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCidadeKeyTyped
        if(Character.isDigit(evt.getKeyChar())){
                evt.consume();
            }
    }//GEN-LAST:event_tfCidadeKeyTyped

    private void tfEstadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEstadoKeyTyped
        if(Character.isDigit(evt.getKeyChar())){
                evt.consume();
            }
    }//GEN-LAST:event_tfEstadoKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
        
        }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Account;
    private javax.swing.JPanel Address;
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Side;
    private javax.swing.JButton btAceito;
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCadastro;
    private javax.swing.JButton btHome;
    private javax.swing.JButton btPesquisa;
    private javax.swing.JButton btRemove;
    private javax.swing.JTextField buscar;
    private javax.swing.JPanel cadastro;
    private javax.swing.JCheckBox chBox;
    private javax.swing.JPanel dadosPesoais;
    private javax.swing.JDialog dialogoBox;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbContador;
    private javax.swing.JLabel lbDataHora;
    private javax.swing.JComboBox<String> selTipo;
    private javax.swing.JRadioButton slFem;
    private javax.swing.ButtonGroup slGenero;
    private javax.swing.JRadioButton slMasc;
    private javax.swing.JPanel table;
    private javax.swing.JTable tableData;
    private javax.swing.JFormattedTextField tdNasc;
    private javax.swing.JTextField tfAbertura;
    private javax.swing.JTextField tfAgencia;
    private javax.swing.JFormattedTextField tfCelular;
    private javax.swing.JFormattedTextField tfCep;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfComplemento;
    private javax.swing.JTextField tfContaNum;
    private javax.swing.JFormattedTextField tfCpf;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JFormattedTextField tfRg;
    private javax.swing.JTextField tfRua;
    private javax.swing.JTextField tfSaldo;
    private javax.swing.JPasswordField tfSenha;
    // End of variables declaration//GEN-END:variables
}

