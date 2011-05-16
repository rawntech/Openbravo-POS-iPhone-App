//    uniCenta oPOS  - Touch Friendly Point Of Sale
//    Copyright (c) 2009-2010 uniCenta
//    http://www.unicenta.net/unicentaopos
//
//    This file is part of uniCenta oPOS
//
//    uniCenta oPOS is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//   uniCenta oPOS is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with uniCenta oPOS.  If not, see <http://www.gnu.org/licenses/>.

package com.openbravo.pos.printer;

import javax.swing.JComponent;

public class DeviceFiscalPrinterNull implements DeviceFiscalPrinter {
    
    /** Creates a new instance of DeviceFiscalPrinterNull */
    public DeviceFiscalPrinterNull() {
    }
    public DeviceFiscalPrinterNull(String desc) {
    }
 
    public String getFiscalName() {
        return null;
    }
    public JComponent getFiscalComponent() {
        return null;
    }
    
    public void beginReceipt() {
    }
    public void endReceipt() {
    }
    public void printLine(String sproduct, double dprice, double dunits, int taxinfo) {
    }
    public void printMessage(String smessage) {
    }
    public void printTotal(String sPayment, double dpaid) {
    }
    
    public void printZReport() {
    }
    public void printXReport() {
    }
}