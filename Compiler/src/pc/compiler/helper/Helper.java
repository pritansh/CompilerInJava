package pc.compiler.helper;

import java.io.FileWriter;
import java.io.IOException;

public class Helper {

	private FileWriter fw = null;
	
	public Helper(FileWriter fw) {
		this.fw = fw;
	}
	
	private void appendToFile(String instructions) {
		try {
			fw.write(instructions);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void repeatString(String val, boolean kind, boolean loop, int loopValue, int value) {
		appendToFile("\nnew java/lang/StringBuilder");
		appendToFile("\ndup\ninvokespecial java/lang/StringBuilder/<init>()V");
		appendToFile("\naload " + val);
		appendToFile("\ninvokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;");
		if(kind) {
			appendToFile("\ninvokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;");
			appendToFile("\nastore 99");
		}
		if(loop) {
			appendToFile("\naload " + value);
			appendToFile("\ninvokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;");
			appendToFile("\ninvokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;");
			if(loopValue>0)
				appendToFile("\nastore " + val);
		}
	}
}
