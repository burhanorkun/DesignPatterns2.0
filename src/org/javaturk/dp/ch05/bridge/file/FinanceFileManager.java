package org.javaturk.dp.ch05.bridge.file;

public class FinanceFileManager implements FileManager {

	FileProviderAdaptor adaptor;

	@Override
	public void setFileAdapter(FileProviderAdaptor adaptor) {
		// TODO Auto-generated method stub
		this.adaptor = adaptor;
	}

	@Override
	public void readFile() {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeFile() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateFile() {
		// TODO Auto-generated method stub

	}

}
