/* The following code was generated by JFlex 1.6.1 */

import java.io.*;

/**
* @author Francisco Fernández Pérez
* num exp: 170
**/


class FernandezPerez {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\4\2\0\1\3\22\0\1\15\2\0\1\14\4\0\1\24"+
    "\1\6\1\16\2\0\1\21\1\25\1\2\12\1\1\12\3\0\1\20"+
    "\2\0\32\1\1\23\1\0\1\5\1\0\1\17\1\0\7\1\1\7"+
    "\7\1\1\11\2\1\1\13\1\10\6\1\1\0\1\0\1\0\1\22"+
    "\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uff91\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\7\1\10\0\1\3\10\0\1\4"+
    "\6\0\2\3\6\0\2\5\1\0\2\6\3\0\1\4"+
    "\1\0\2\7\2\0\1\10\4\0\2\11\2\12\4\0"+
    "\1\12\7\0\2\13\1\12\1\0\1\12\1\0\1\14"+
    "\1\15\3\0\1\16\3\0\2\17\2\0\1\7\1\16"+
    "\2\0\2\20\1\14\2\21\1\16\2\0\2\22\6\0"+
    "\1\23\1\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[119];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\26\0\54\0\26\0\102\0\130\0\156\0\204"+
    "\0\232\0\260\0\306\0\334\0\362\0\u0108\0\u011e\0\u0134"+
    "\0\u014a\0\u0160\0\u0176\0\u018c\0\u01a2\0\u01b8\0\u01ce\0\306"+
    "\0\u01e4\0\u01fa\0\u0210\0\u0226\0\26\0\u023c\0\u0252\0\u0268"+
    "\0\u027e\0\u0294\0\u02aa\0\u02c0\0\26\0\u02d6\0\u02ec\0\u0302"+
    "\0\u0318\0\u032e\0\u0344\0\u0226\0\26\0\u035a\0\u0370\0\26"+
    "\0\u0386\0\u039c\0\u03b2\0\u03c8\0\u03de\0\u03f4\0\u040a\0\u0420"+
    "\0\u0436\0\26\0\u044c\0\u0462\0\u0478\0\u048e\0\u0344\0\26"+
    "\0\u04a4\0\u04ba\0\u04d0\0\u04e6\0\u03c8\0\u04fc\0\u0512\0\u0528"+
    "\0\u053e\0\u0554\0\u056a\0\u0580\0\u0596\0\u05ac\0\u048e\0\26"+
    "\0\26\0\u05c2\0\u05c2\0\u05d8\0\u04a4\0\26\0\u05ee\0\u0604"+
    "\0\u061a\0\u0630\0\u0646\0\u065c\0\u0672\0\u05ac\0\26\0\u0688"+
    "\0\u069e\0\u069e\0\u06b4\0\u06ca\0\u06e0\0\u0672\0\26\0\26"+
    "\0\u069e\0\u040a\0\26\0\u06f6\0\u070c\0\u06e0\0\26\0\u0722"+
    "\0\u0738\0\u074e\0\u0764\0\u077a\0\u0790\0\26\0\u07a6";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[119];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\3\2\1\3\1\4\7\2\1\5\1\2\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\2\2\32\0\1\4\35\0"+
    "\1\14\1\15\10\0\16\16\1\17\7\16\4\20\1\21"+
    "\11\20\1\22\1\23\6\20\15\0\1\24\25\0\1\25"+
    "\3\0\1\26\26\0\1\27\3\0\3\30\2\0\1\31"+
    "\15\30\1\0\2\30\14\0\1\32\1\33\10\0\4\34"+
    "\1\0\7\34\1\0\11\34\16\16\1\35\7\16\4\36"+
    "\1\37\11\36\1\40\1\41\6\36\4\20\1\21\11\20"+
    "\1\22\1\35\6\20\17\21\1\35\24\21\1\42\1\35"+
    "\6\21\17\43\1\40\6\43\3\24\1\44\1\45\21\24"+
    "\4\46\1\0\21\46\21\0\1\40\26\0\1\47\27\0"+
    "\1\50\15\0\1\51\1\52\10\0\4\53\1\0\7\53"+
    "\1\0\11\53\3\34\1\54\1\55\7\34\1\0\11\34"+
    "\4\36\1\37\11\36\1\56\1\41\6\36\16\37\1\56"+
    "\7\37\3\0\1\57\1\60\21\0\4\41\1\37\11\41"+
    "\1\61\1\62\6\41\4\42\1\21\11\42\1\63\1\64"+
    "\6\42\17\43\1\65\6\43\4\0\1\45\21\0\3\46"+
    "\1\66\1\67\21\46\22\47\1\70\3\47\3\71\3\0"+
    "\1\72\1\73\13\71\2\0\1\71\14\0\1\74\1\75"+
    "\10\0\4\76\1\0\7\76\1\0\11\76\3\53\1\77"+
    "\1\100\7\53\1\0\11\53\16\37\1\101\7\37\4\0"+
    "\1\60\21\0\4\41\1\37\11\41\1\102\1\62\6\41"+
    "\4\62\1\37\11\62\1\103\1\37\6\62\16\21\1\104"+
    "\1\35\6\21\4\105\1\0\11\105\1\106\7\105\17\43"+
    "\1\107\6\43\3\46\1\66\1\67\14\46\1\110\4\46"+
    "\21\0\1\111\4\0\22\47\1\112\3\47\3\71\3\0"+
    "\1\72\14\71\2\0\4\71\3\0\1\72\1\71\1\113"+
    "\12\71\2\0\1\71\14\0\1\114\1\115\10\0\4\116"+
    "\1\0\7\116\1\0\11\116\3\76\1\117\1\120\7\76"+
    "\1\0\11\76\16\0\1\121\7\0\4\122\1\0\11\122"+
    "\1\123\1\124\6\122\16\37\1\125\7\37\4\104\1\21"+
    "\11\104\1\21\1\126\6\104\16\0\1\127\26\0\1\121"+
    "\6\0\3\46\1\66\1\67\10\46\1\130\10\46\15\0"+
    "\1\131\10\0\22\47\1\132\3\47\3\71\3\0\1\72"+
    "\1\71\1\133\12\71\2\0\1\71\15\0\1\134\10\0"+
    "\4\135\1\0\7\135\1\0\11\135\3\116\1\136\1\137"+
    "\7\116\1\0\11\116\4\122\1\0\12\122\1\124\6\122"+
    "\4\124\1\0\11\124\1\140\1\0\6\124\4\127\1\0"+
    "\11\127\1\0\1\126\6\127\3\141\1\142\1\67\25\141"+
    "\1\0\21\141\22\0\1\143\3\0\3\71\3\0\1\72"+
    "\2\71\1\144\11\71\2\0\1\71\4\145\1\0\7\145"+
    "\1\0\11\145\3\135\1\146\1\147\7\135\1\0\11\135"+
    "\16\0\1\150\7\0\3\141\1\151\1\152\21\141\22\0"+
    "\1\153\3\0\3\71\3\0\1\72\3\71\1\154\1\155"+
    "\7\71\2\0\1\71\3\145\1\156\1\157\7\145\1\0"+
    "\11\145\2\71\1\160\3\0\1\72\14\71\2\0\4\71"+
    "\3\0\1\72\3\71\1\154\10\71\2\0\3\71\1\161"+
    "\3\0\1\72\14\71\2\0\2\71\1\162\1\71\3\0"+
    "\1\72\3\162\1\71\1\162\7\71\2\0\2\71\1\162"+
    "\1\71\3\0\1\72\3\162\1\71\1\162\7\71\2\0"+
    "\1\163\1\71\1\164\1\165\3\0\1\72\3\164\1\71"+
    "\1\164\7\71\2\0\2\71\1\164\1\165\3\0\1\166"+
    "\3\164\1\71\1\164\7\71\2\0\1\167\1\71\2\165"+
    "\3\0\1\166\3\165\1\71\1\165\7\71\2\0\2\71"+
    "\2\165\3\0\1\72\3\165\1\71\1\165\7\71\2\0"+
    "\1\71";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1980];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\7\1\10\0\1\1\10\0"+
    "\1\11\6\0\1\1\1\11\6\0\1\1\1\11\1\0"+
    "\1\1\1\11\3\0\1\1\1\0\2\1\2\0\1\11"+
    "\4\0\1\1\1\11\2\1\4\0\1\1\7\0\1\1"+
    "\2\11\1\0\1\1\1\0\1\1\1\11\3\0\1\1"+
    "\3\0\1\1\1\11\2\0\2\1\2\0\1\1\2\11"+
    "\2\1\1\11\2\0\1\1\1\11\6\0\1\11\1\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[119];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
 /* Código personalizado */
  
// private int c = 0;
 	FileWriter fichero = null;
	PrintWriter pw = null;
	private int encabezado;
 


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  FernandezPerez(java.io.Reader in) {
   /* Código que se ejecutará en el constructor de la clase */

	/*Codigo para redirigir la salida a un archivo .html */
 String fileName="salida.html";  
    try {

        PrintStream ps = new PrintStream(new BufferedOutputStream(

                new FileOutputStream(new File(fileName),false)),true);
        //Redirigimos entrada y salida estandar
        System.setOut(ps);
        System.setErr(ps);
    } catch (FileNotFoundException ex) {

        System.err.println("Error en la apertura del fichero de salida");

    }
	////
 	System.out.println("<!DOCTYPE html><html>");
 	System.out.println("<head>");
 	System.out.println("<title>MarkDown2HTML</title>");
 	System.out.println("<style> ");
 	System.out.println("	.bold {font-weight: bold;} ");
 	System.out.println("	.ital {font-style: italic;}");
 	System.out.println("</style>");
 	System.out.println("</head><body> ");

    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 114) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
     /* Código a ejecutar al finalizar el análisis */
	
	System.out.println("</body></html>");


    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.print(yytext());
            }
          case 20: break;
          case 2: 
            { System.out.println("");
            }
          case 21: break;
          case 3: 
            { String cadena = yytext();
				cadena=cadena.replace(">","	");
				System.out.println("<blockquote>\n"+cadena+"</blockquote>");
            }
          case 22: break;
          case 4: 
            { String cadena = yytext();
				cadena=cadena.substring(1,yylength()-1);
				System.out.print("<SPAN class=\"ital\">"+cadena+"</SPAN>");
            }
          case 23: break;
          case 5: 
            { String cadena = yytext();				
				cadena = cadena.substring(1,yylength()-2);
				System.out.print("<h1>"+cadena+"</h1>");
				System.out.println();//Se le añade para meter el \n que le quitamos con substring
            }
          case 24: break;
          case 6: 
            { System.out.println("<hr/>");
            }
          case 25: break;
          case 7: 
            { String cadena = yytext();
				cadena = cadena.substring(1,yylength()-2);
				System.out.print("<ul><li>"+cadena+"</li></ul>");
            }
          case 26: break;
          case 8: 
            { String url="",text="";
				String cadena = yytext();
				int length = cadena.length();
				for (int i = 1 ;i<length ;i++ ) {					
					if (cadena.charAt(i)==']'){
						url = cadena.substring(i+2,length-1);
						text = cadena.substring(1,i);
					}					
				}
				System.out.print("<A HREF=\""+url+ "\">");
				System.out.print(text+"(URL aparentemente incorrecta)");
				System.out.print("</A><br>");
            }
          case 27: break;
          case 9: 
            { String cadena = yytext();				
				cadena = cadena.substring(2,yylength()-2);
				System.out.print("<h2>"+cadena+"</h2>");
				System.out.println();
            }
          case 28: break;
          case 10: 
            { String cadena = yytext();
				cadena = cadena.substring(2,yylength()-2);
				System.out.print("<SPAN class=\"bold\">"+cadena+"</SPAN>");
            }
          case 29: break;
          case 11: 
            { String cadena = yytext();				
				cadena = cadena.substring(3,yylength()-2);
				System.out.print("<h3>"+cadena+"</h3>");
				System.out.println();
            }
          case 30: break;
          case 12: 
            { String cadenAux,cadena = yytext();
						int c=0;
						while (cadena.charAt(c)!='_'){
							c++;
						}
						cadenAux = cadena.substring(2,c);
						System.out.print("<SPAN class=\"bold\">"+cadenAux);
						cadena = cadena.substring(c+1,cadena.length());
						c=0;
						while (cadena.charAt(c)!='_'){
							c++;
						}
						cadenAux= cadena.substring(0,c);
						System.out.print("<SPAN class=\"ital\">"+cadenAux+"</SPAN>");
						cadena = cadena.substring(c+1,cadena.length()-2);
						System.out.print(cadena+"</SPAN>");
            }
          case 31: break;
          case 13: 
            { String cadenAux,cadena = yytext();
						int c = 0;
						while (cadena.charAt(c)!='*'){
							c++;
						}
						cadenAux = cadena.substring(1,c);
						System.out.print("<SPAN class=\"ital\">"+cadenAux);
						cadena = cadena.substring(c+2,cadena.length());
						c=0;
						while (cadena.charAt(c)!='*'){
							c++;
						}
						cadenAux= cadena.substring(0,c);
						System.out.print("<SPAN class=\"bold\">"+cadenAux+"</SPAN>");
						cadena = cadena.substring(c+2,cadena.length()-1);
						System.out.print(cadena+"</SPAN>");
            }
          case 32: break;
          case 14: 
            { String cadena = yytext();
				cadena=cadena.replace("~","");
				System.out.println("<code> <pre>"+cadena+"</pre></code>");
            }
          case 33: break;
          case 15: 
            { String cadena = yytext();				
				cadena = cadena.substring(4,yylength()-2);
				System.out.print("<h4>"+cadena+"</h4>");
				System.out.println();
            }
          case 34: break;
          case 16: 
            { String cadena = yytext();				
				cadena = cadena.substring(5,yylength()-2);
				System.out.print("<h5>"+cadena+"</h5>");
				System.out.println();
            }
          case 35: break;
          case 17: 
            { String cadena = yytext();
				String cadenAux;
				int c;
				System.out.println("<ul>");
				while (!cadena.isEmpty()){
					if (cadena.charAt(0)=='-'){
						c=1;
						while (cadena.charAt(c)!='\n'){
							c++;
						}
						cadenAux = cadena.substring(1,c-1);
						System.out.println("<li>"+cadenAux+"</li>");
						cadena = cadena.substring(c+1,cadena.length());
					}else {
						cadena=cadena.substring(1,cadena.length());
					}
				}				
				System.out.print("</ul>");
            }
          case 36: break;
          case 18: 
            { String cadena = yytext();				
				cadena = cadena.substring(6,yylength()-2);//Recortamos yytext quitandole las # y el \n del final.(dejo el espacio inicial)				
				System.out.print("<h6>"+cadena+"</h6>");
				System.out.println();
            }
          case 37: break;
          case 19: 
            { String url="",text="";
				String cadena = yytext();
				int length = cadena.length();
				for (int i = 1 ;i<length ;i++ ) {					
					if (cadena.charAt(i)==']'){
						url = cadena.substring(i+2,length-1);
						text = cadena.substring(1,i);
					}					
				}
				System.out.print("<A HREF=\""+url+ "\">");
				System.out.print(text);
				System.out.print("</A><br>");//<br> introduccido para que al verlo como html salte de linea ya que <a> no lo hace
            }
          case 38: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java FernandezPerez [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        FernandezPerez scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new FernandezPerez(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
