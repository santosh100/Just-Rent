/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROJECT;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.sf.dynamicreports.examples.Templates;
import static net.sf.dynamicreports.examples.Templates.boldCenteredStyle;
import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.builder.DynamicReports;
import static net.sf.dynamicreports.report.builder.DynamicReports.cmp;
import static net.sf.dynamicreports.report.builder.DynamicReports.sbt;
import static net.sf.dynamicreports.report.builder.DynamicReports.stl;
import net.sf.dynamicreports.report.builder.column.Columns;
import net.sf.dynamicreports.report.builder.column.TextColumnBuilder;
import net.sf.dynamicreports.report.builder.component.ComponentBuilder;
import net.sf.dynamicreports.report.builder.component.Components;
import net.sf.dynamicreports.report.builder.component.HorizontalListBuilder;
import net.sf.dynamicreports.report.builder.datatype.DataTypes;
import net.sf.dynamicreports.report.builder.style.StyleBuilder;
import net.sf.dynamicreports.report.constant.HorizontalTextAlignment;
import net.sf.dynamicreports.report.constant.VerticalTextAlignment;
import net.sf.dynamicreports.report.exception.DRException;

/**
 *
 * @author user
 */
public class GenerateReport {

    String url;
    PreparedStatement pstmt, mypstmt;
    ResultSet rs, myrs;

    /**
     * ***********************************************************************************
     */
    public void showListOfRoomReport() {

        StyleBuilder columnTitleStyle = stl.style(boldCenteredStyle)
                .setBorder(stl.pen1Point())
                .setBackgroundColor(Color.WHITE);
        StyleBuilder boldStyle = stl.style().bold();
        StyleBuilder boldStyle2 = stl.style(boldStyle).setBottomBorder(stl.pen2Point());

        StyleBuilder bold14CenteredStyle, boldl8CenteredStyle;
        boldl8CenteredStyle = stl.style(boldStyle).setTextAlignment(HorizontalTextAlignment.CENTER, VerticalTextAlignment.MIDDLE).setFontSize(10);
        bold14CenteredStyle = stl.style(boldStyle).setTextAlignment(HorizontalTextAlignment.CENTER, VerticalTextAlignment.MIDDLE).setFontSize(14);
        StyleBuilder bold17CenteredStyle = stl.style(boldStyle)
                .setTextAlignment(HorizontalTextAlignment.CENTER, VerticalTextAlignment.MIDDLE)
                .setFontSize(17);
        JasperReportBuilder report = DynamicReports.report()
                .setColumnTitleStyle(columnTitleStyle)
                .setColumnStyle(boldCenteredStyle)
                .columns(
                        Columns.column("ROOM NO", "ROOM_NO", DataTypes.integerType()),
                        Columns.column("ROOM TYPE", "ROOM_TYPE", DataTypes.stringType()),
                        Columns.column("PRICE", "PRICE", DataTypes.stringType())
                )
                .title(//title of the report                   
                        Components.text("").setStyle(boldStyle2),
                        Components.text(""),
                        Components.text("LIST OF ROOMS").setStyle(boldl8CenteredStyle),
                        Components.text("")
                                .setStyle(boldCenteredStyle)
                                .setHorizontalTextAlignment(HorizontalTextAlignment.CENTER),
                        Components.text("").setStyle(boldStyle2)
                )
                .setColumnTitleStyle(columnTitleStyle)
                .pageFooter(Components.pageXofY())//show page number on the page footer
                .setDataSource("select * from ROOM_DETAIL", MyLogin.con);

        try {
            //show the report
            report.show(false);

        } catch (DRException e) {
            e.printStackTrace();
        }
    }

    /**
     * ***********************************************************************************
     */
    public void showListOfCustomersReport() {

        StyleBuilder columnTitleStyle = stl.style(boldCenteredStyle)
                .setBorder(stl.pen1Point())
                .setBackgroundColor(Color.WHITE);
        StyleBuilder boldStyle = stl.style().bold();
        StyleBuilder boldStyle2 = stl.style(boldStyle).setBottomBorder(stl.pen2Point());

        StyleBuilder bold14CenteredStyle, boldl8CenteredStyle;
        boldl8CenteredStyle = stl.style(boldStyle).setTextAlignment(HorizontalTextAlignment.CENTER, VerticalTextAlignment.MIDDLE).setFontSize(10);
        bold14CenteredStyle = stl.style(boldStyle).setTextAlignment(HorizontalTextAlignment.CENTER, VerticalTextAlignment.MIDDLE).setFontSize(14);
        StyleBuilder bold17CenteredStyle = stl.style(boldStyle)
                .setTextAlignment(HorizontalTextAlignment.CENTER, VerticalTextAlignment.MIDDLE)
                .setFontSize(17);
        JasperReportBuilder report = DynamicReports.report()
                .setColumnTitleStyle(columnTitleStyle)
                .setColumnStyle(boldCenteredStyle)
                .columns(
                        Columns.column("CUSTOMER ID", "C_ID", DataTypes.integerType()),
                        Columns.column("CUSTOMER NAME", "C_NAME", DataTypes.stringType()),
                        Columns.column("GENDER", "C_GENDER", DataTypes.stringType()),
                        Columns.column("MOBILE NO", "C_MOB_NO", DataTypes.stringType()),
                        Columns.column("ADDRESS", "C_ADDRESS", DataTypes.stringType())
                )
                .title(//title of the report                   
                        Components.text("").setStyle(boldStyle2),
                        Components.text(""),
                        Components.text("LIST OF CUSTOMERS").setStyle(boldl8CenteredStyle),
                        Components.text("")
                                .setStyle(boldCenteredStyle)
                                .setHorizontalTextAlignment(HorizontalTextAlignment.CENTER),
                        Components.text("").setStyle(boldStyle2)
                )
                .setColumnTitleStyle(columnTitleStyle)
                .pageFooter(Components.pageXofY())//show page number on the page footer
                .setDataSource("select * from CUSTOMER_DETAIL", MyLogin.con);

        try {
            //show the report
            report.show(false);

        } catch (DRException e) {
            e.printStackTrace();
        }
    }

    /**
     * ***********************************************************************************
     */
    public void showRoomStatus(String query, String stocktitle) {

        StyleBuilder columnTitleStyle = stl.style(boldCenteredStyle)
                .setBorder(stl.pen1Point())
                .setBackgroundColor(Color.WHITE);
        StyleBuilder boldStyle = stl.style().bold();
        StyleBuilder boldStyle2 = stl.style(boldStyle).setBottomBorder(stl.pen2Point());

        StyleBuilder bold14CenteredStyle, boldl8CenteredStyle;
        boldl8CenteredStyle = stl.style(boldStyle).setTextAlignment(HorizontalTextAlignment.CENTER, VerticalTextAlignment.MIDDLE).setFontSize(10);
        bold14CenteredStyle = stl.style(boldStyle).setTextAlignment(HorizontalTextAlignment.CENTER, VerticalTextAlignment.MIDDLE).setFontSize(14);
        StyleBuilder bold17CenteredStyle = stl.style(boldStyle)
                .setTextAlignment(HorizontalTextAlignment.CENTER, VerticalTextAlignment.MIDDLE)
                .setFontSize(17);
        JasperReportBuilder report = DynamicReports.report()
                .setColumnTitleStyle(columnTitleStyle)
                .setColumnStyle(boldCenteredStyle)
                .columns(
                        Columns.column("ROOM NO", "ROOM_NO", DataTypes.integerType()),
                        Columns.column("ROOM TYPE", "ROOM_TYPE", DataTypes.stringType()),
                        Columns.column("PRICE PER DAY", "PRICE", DataTypes.integerType())
                )
                .title(//title of the report                  
                        Components.text("").setStyle(boldStyle2),
                        Components.text(""),
                        Components.text(stocktitle).setStyle(boldl8CenteredStyle),
                        Components.text("")
                                .setStyle(boldCenteredStyle)
                                .setHorizontalTextAlignment(HorizontalTextAlignment.CENTER)
                )
                .setColumnTitleStyle(columnTitleStyle)
                .pageFooter(Components.pageXofY())//show page number on the page footer
                .setDataSource(query, MyLogin.con);

        try {
            //show the report
            report.show(false);

        } catch (DRException e) {
            e.printStackTrace();
        }
    }

    /**
     * ****************************************************************************************************
     */
    public void generateBill(String myquery) {

        StyleBuilder boldStyle = stl.style().bold();
        StyleBuilder boldStyle2 = stl.style(boldStyle).setBottomBorder(stl.pen2Point());
        StyleBuilder subtotalStyle = stl.style(boldStyle)
                .setTopBorder(stl.pen1Point())
                .setHorizontalTextAlignment(HorizontalTextAlignment.CENTER);

        StyleBuilder boldCenteredStyle, bold14CenteredStyle, boldl8CenteredStyle;
        boldl8CenteredStyle = stl.style(boldStyle).setTextAlignment(HorizontalTextAlignment.CENTER, VerticalTextAlignment.MIDDLE).setFontSize(10);
        bold14CenteredStyle = stl.style(boldStyle).setTextAlignment(HorizontalTextAlignment.CENTER, VerticalTextAlignment.MIDDLE).setFontSize(14);
        StyleBuilder bold17CenteredStyle = stl.style(boldStyle)
                .setTextAlignment(HorizontalTextAlignment.CENTER, VerticalTextAlignment.MIDDLE)
                .setFontSize(17);
        boldCenteredStyle = stl.style(boldStyle)
                .setHorizontalTextAlignment(HorizontalTextAlignment.CENTER);
        StyleBuilder columnTitleStyle = stl.style(boldCenteredStyle)
                .setBorder(stl.pen1Point())
                //    .setBackgroundColor(Color.LIGHT_GRAY);
                .setBackgroundColor(Color.WHITE);

        TextColumnBuilder<Integer> totalColumn = Columns.column("PAID MONEY", "TOTAL_PAID", DataTypes.integerType());

        String bill_dt = "", booked_id = "", c_gender = "", c_name = "", c_address = "", bill_no = "", c_mob_no = "";
        try {
            pstmt = MyLogin.con.prepareStatement(myquery, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                bill_no = "" + rs.getInt("BILL_NO");
                bill_dt = "" + rs.getDate("BILL_DT");
                booked_id = "" + rs.getInt("BOOKED_ID");
                c_name = rs.getString("C_NAME");
                c_gender = rs.getString("C_GENDER");
                c_mob_no = rs.getString("C_MOB_NO");
                c_address = rs.getString("C_ADDRESS");
            }
        } catch (Exception e) {
            System.out.println("Exception in selecting data from sales detail " + e);
        }

        JasperReportBuilder report = DynamicReports.report();//a new report
        report
                .setColumnTitleStyle(columnTitleStyle)
                .setColumnStyle(boldCenteredStyle)
                .columns(
                        Columns.column("ROOM NO", "ROOM_NO", DataTypes.integerType()),
                        Columns.column("ROOM TYPE", "ROOM_TYPE", DataTypes.stringType()),
                        Columns.column("BOOKED DATE", "BOOKED_DT", DataTypes.dateType()),
                        Columns.column("CHECK IN", "IN_DT", DataTypes.dateType()),
                        Columns.column("CHECK OUT", "OUT_DT", DataTypes.dateType()),
                        Columns.column("ROOM CHARGE", "ROOM_CHARGE", DataTypes.integerType()),
                        Columns.column("SERVICE CHARGE", "SERVICE_CHARGE", DataTypes.integerType()),
                        Columns.column("ADVANCE PAY", "ADVANCE_PAY", DataTypes.integerType()),
                        totalColumn
                )
                .title(//title of the report

                        Components.text("ROOM RENT MANAGEMENT").setStyle(bold14CenteredStyle),
                        Components.text("").setStyle(boldStyle2),
                        cmp.horizontalList().setStyle(stl.style(1)).setGap(0).add(
                                cmp.hListCell(createMyComponent("BILL NO " + bill_no, booked_id, c_name, c_gender, 0)),
                                 cmp.hListCell(createMyComponent("BILL DATE " + bill_dt, c_mob_no, "", c_address, 1))
                        ),
                        cmp.verticalGap(10)
                                .setStyle(boldCenteredStyle))
                .subtotalsAtSummary(
                        sbt.sum(totalColumn).setLabel("Total :").setStyle(subtotalStyle))
                .pageFooter(Components.pageXofY())//show page number on the page footer
                .setDataSource(myquery, MyLogin.con);
        try {

            //show the report
            report.show(false);
            //export the report to a pdf file
            //    report.toPdf(new FileOutputStream("d:/bill_no_"+inv_no+"report.pdf"));
            //    JOptionPane.showMessageDialog(null, "Bill generated see \n D:\bill_no"+inv_no+"report.pdf", "Bill Report", JOptionPane.INFORMATION_MESSAGE);

        } catch (DRException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception inside generate report " + e);
        }
    }

    /**
     * ********************************************************************************************************
     */
    private ComponentBuilder<?, ?> createMyComponent(String label, String value1, String value2, String value3, Integer i) {
        HorizontalListBuilder list = cmp.horizontalList().setBaseStyle(stl.style().setTopBorder(stl.pen1Point()).setPadding(10));
        if (i == 0) {
            addMyAttribute(list, "BOOKED ID   : ", value1);
            addMyAttribute(list, "CUSTOMER NAME : ", value2);
            addMyAttribute(list, "GENDER  : ", value3);
        } else {
            addMyAttribute(list, "MOB        : ", value1);
            addMyAttribute(list, "", value2);
            addMyAttribute(list, "ADDRESS      : ", value3);
        }
        return cmp.verticalList(cmp.text(label).setStyle(Templates.boldStyle), list);
    }

    private void addMyAttribute(HorizontalListBuilder list, String label, String value) {
        if (value != null) {
            list.add(cmp.text(label).setFixedColumns(10).setStyle(Templates.boldStyle), cmp.text(value)).newRow();
        }
    }

    /**
     * ***********************************************************************************
     */
    public void showReportBtweenTwoDates(String query, String stocktitle) {

        StyleBuilder columnTitleStyle = stl.style(boldCenteredStyle)
                .setBorder(stl.pen1Point())
                .setBackgroundColor(Color.WHITE);
        StyleBuilder boldStyle = stl.style().bold();
        StyleBuilder boldStyle2 = stl.style(boldStyle).setBottomBorder(stl.pen2Point());

        StyleBuilder boldl8CenteredStyle;
        boldl8CenteredStyle = stl.style(boldStyle).setTextAlignment(HorizontalTextAlignment.CENTER, VerticalTextAlignment.MIDDLE).setFontSize(10);
        JasperReportBuilder report = DynamicReports.report()
                .setColumnTitleStyle(columnTitleStyle)
                .setColumnStyle(boldCenteredStyle)
                .columns(
                        Columns.column("BOOKED ID", "BOOKED_ID", DataTypes.integerType()),
                        Columns.column("BOOKED DATE", "BOOKED_DT", DataTypes.dateType()),
                        Columns.column("ROOM NO", "ROOM_NO", DataTypes.integerType()),
                        Columns.column("CUSTOMER NAME", "C_NAME", DataTypes.stringType()),
                        Columns.column("MOBILE NO", "C_MOB_NO", DataTypes.stringType()),
                        Columns.column("CHECK IN", "IN_DT", DataTypes.dateType()),
                        Columns.column("CHECK OUT", "OUT_DT", DataTypes.dateType())
                )
                .title(//title of the report                  
                        Components.text("").setStyle(boldStyle2),
                        Components.text(""),
                        Components.text(stocktitle).setStyle(boldl8CenteredStyle),
                        Components.text("")
                                .setStyle(boldCenteredStyle)
                                .setHorizontalTextAlignment(HorizontalTextAlignment.CENTER)
                )
                .setColumnTitleStyle(columnTitleStyle)
                .pageFooter(Components.pageXofY())//show page number on the page footer
                .setDataSource(query, MyLogin.con);

        try {
            //show the report
            report.show(false);

        } catch (DRException e) {
            e.printStackTrace();
        }
    }

    /**
     * ***********************************************************************************
     */
    public void showStaffReport() {

        StyleBuilder columnTitleStyle = stl.style(boldCenteredStyle)
                .setBorder(stl.pen1Point())
                .setBackgroundColor(Color.WHITE);
        StyleBuilder boldStyle = stl.style().bold();
        StyleBuilder boldStyle2 = stl.style(boldStyle).setBottomBorder(stl.pen2Point());

        StyleBuilder bold14CenteredStyle, boldl8CenteredStyle;
        boldl8CenteredStyle = stl.style(boldStyle).setTextAlignment(HorizontalTextAlignment.CENTER, VerticalTextAlignment.MIDDLE).setFontSize(10);
        bold14CenteredStyle = stl.style(boldStyle).setTextAlignment(HorizontalTextAlignment.CENTER, VerticalTextAlignment.MIDDLE).setFontSize(14);
        StyleBuilder bold17CenteredStyle = stl.style(boldStyle)
                .setTextAlignment(HorizontalTextAlignment.CENTER, VerticalTextAlignment.MIDDLE)
                .setFontSize(17);
        JasperReportBuilder report = DynamicReports.report()
                .setColumnTitleStyle(columnTitleStyle)
                .setColumnStyle(boldCenteredStyle)
                .columns(
                        Columns.column("MEMBER ID", "S_ID", DataTypes.integerType()),
                        Columns.column("MEMBER NAME", "S_NAME", DataTypes.stringType()),
                        Columns.column("FATHER'S NAME", "S_F_NAME", DataTypes.stringType()),
                        Columns.column("MOBILE NO", "S_MOB_NO", DataTypes.stringType()),
                        Columns.column("JOIN DATE", "S_JOIN_DT", DataTypes.stringType()),
                        Columns.column("RESIGN DATE", "S_REGN_DT", DataTypes.stringType()),
                        Columns.column("ADDRESS", "S_ADDRESS", DataTypes.stringType())
                )
                .title(//title of the report                   
                        Components.text("").setStyle(boldStyle2),
                        Components.text(""),
                        Components.text("LIST OF STAFF MEMBERS").setStyle(boldl8CenteredStyle),
                        Components.text("")
                                .setStyle(boldCenteredStyle)
                                .setHorizontalTextAlignment(HorizontalTextAlignment.CENTER),
                        Components.text("").setStyle(boldStyle2)
                )
                .setColumnTitleStyle(columnTitleStyle)
                .pageFooter(Components.pageXofY())//show page number on the page footer
                .setDataSource("select * from STAFF_DETAIL", MyLogin.con);

        try {
            //show the report
            report.show(false);

        } catch (DRException e) {
            e.printStackTrace();
        }
    }

}
