package org.example.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Scale;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

public class App {
  private final Display display;
  private final Shell shell;

  public static void main(String[] args) {
    var app = new App();
    app.run();
  }

  private App() {
    display = new Display();
    shell = new Shell(display);
    shell.setText("SWT Example");
    shell.setLayout(new RowLayout(SWT.VERTICAL));

    var group = new Group(shell, SWT.NONE);
    group.setText("Buttons");
    var rowLayout = new RowLayout(SWT.HORIZONTAL);
    rowLayout.center = true;
    group.setLayout(rowLayout);

    var button = new Button(group, SWT.PUSH);
    button.setText("Push");

    button = new Button(group, SWT.CHECK);
    button.setText("Check");

    button = new Button(group, SWT.RADIO);
    button.setText("Radio");

    button = new Button(group, SWT.TOGGLE);
    button.setText("Toggle");

    var composite = new Composite(shell, SWT.NONE);
    rowLayout = new RowLayout(SWT.HORIZONTAL);
    rowLayout.center = true;
    composite.setLayout(rowLayout);

    composite = new Composite(shell, SWT.NONE);
    var gridLayout = new GridLayout(2, false);
    composite.setLayout(gridLayout);

    var label = new Label(composite, SWT.NONE);
    label.setText("Label:");
    var combo = new Combo(composite, SWT.NONE);
    combo.setText("Combo");

    label = new Label(composite, SWT.NONE);
    label.setText("Progress:");
    new ProgressBar(composite, SWT.NONE);

    label = new Label(composite, SWT.NONE);
    label.setText("Spinner:");
    new Spinner(composite, SWT.NONE);

    label = new Label(composite, SWT.NONE);
    label.setText("Spinner:");
    new Scale(composite, SWT.NONE);

    label = new Label(composite, SWT.NONE);
    label.setText("Label:");
    var text = new Text(composite, SWT.SINGLE | SWT.BORDER);
    text.setText("Text");

    var table = new Table(shell, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
    table.setHeaderVisible(true);
    table.setLinesVisible(true);
    var column1 = new TableColumn(table, SWT.NONE);
    column1.setText("Column 1");
    var column2 = new TableColumn(table, SWT.NONE);
    column2.setText("Column 2");
    var item = new TableItem(table, SWT.NONE);
    item.setText("Cell 1");
    item = new TableItem(table, SWT.NONE);
    item.setText("Cell 2");
    item = new TableItem(table, SWT.NONE);
    item.setText("Cell 3");
    item = new TableItem(table, SWT.NONE);
    item.setText("Cell 4");
    column1.pack();
    column2.pack();
  }

  private void run() {
    shell.open();
    while (!shell.isDisposed()) {
      if (!display.readAndDispatch()) {
        display.sleep();
      }
    }
    display.dispose();
  }
}
