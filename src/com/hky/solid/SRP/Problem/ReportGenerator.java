package com.hky.solid.SRP.Problem;
//The Single Responsibility Principle advocates that a class should have only one reason to change.
// Let’s consider an example involving a reporting system:
public class ReportGenerator {

        public void generatePDFReport() {
            // logic to generate a PDF report
        }

        public void generateCSVReport() {
            // logic to generate a CSV report
        }

        public void sendEmail() {
            // logic to send an email
        }
    }





//In this case, the ReportGenerator class violates SRP because it has multiple responsibilities:
// generating different types of reports and sending emails.
// A better approach is to separate these concerns into different classes: