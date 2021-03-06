package by.epam.lw02.bl.command;

import by.epam.lw02.bl.Builder;
import by.epam.lw02.bl.Command;
import by.epam.lw02.bl.TransferObject;
import by.epam.lw02.bl.exception.NotFoundException;
import by.epam.lw02.bl.to.AppendedTransferObject;
import by.epam.lw02.bl.to.ExceptionTransferObject;
import by.epam.lw02.bl.to.wrap.WrapTransferObject;

/**
 */
public class SelectWrapCommand implements Command {

    public final static String ID = "select-wrap";

    @Override
    public TransferObject execute(TransferObject transferObject) {
        WrapTransferObject wrapTO = (WrapTransferObject) transferObject;

        try {
            Builder.getInstance().setWrap(wrapTO);
            return new AppendedTransferObject();
        } catch (NotFoundException e) {
            return new ExceptionTransferObject(e);
        }
    }
}
