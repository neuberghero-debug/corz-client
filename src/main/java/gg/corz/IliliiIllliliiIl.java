package gg.corz;

import java.util.BitSet;

public final class IliliiIllliliiIl {
   public static final byte IlIlilIlll = 2;
   private int IIllilIlll;
   private final byte[] IiIlilIlll;
   public static final byte lIIlilIlll = 0;
   private final BitSet liIlilIlll;
   private int iiIlilIlll;
   public static final byte iIIlilIlll = 1;
   private int lIllilIlll;
   public static final byte ilIlilIlll = 4;
   public static final byte llIlilIlll = 3;

   public IliliiIllliliiIl(int cells) {
      this.IiIlilIlll = new byte[cells];
      this.liIlilIlll = new BitSet(cells);
      this.liIlilIlll.set(0, cells);
   }

   public int Illlllllilll() {
      return this.liIlilIlll.cardinality();
   }

   public int IIlllIlliIll() {
      return this.lIllilIlll;
   }

   public String Iilllilliill() {
      return IIillIiliIil<"IIillIiliIil","TF4mLQBW6RUnVCtzUjL+FSesTfCVAtSYCD0ygFyPDbzePhus7MymTBVaWwM39w==">()
         + this.iiIlilIlll
         + IIillIiliIil<"IIillIiliIil","shkhFdrNWZKgGiA4YkiASQKObN7geuzc1F+Vfx0J48MCTPo5ynDF8OFEL9jtwMG3tUxRPuc=">()
         + this.IIllilIlll
         + IIillIiliIil<"IIillIiliIil","RpM9SrXezQuuvugAFBJJhALn/UtIYYp8+wZimQBM01GTBCGr1Wjgp2uRyVvedbFsQqo2">()
         + this.lIllilIlll;
   }

   public boolean IilliliilIIi(int i) {
      return !this.liIlilIlll.get(i) && this.IiIlilIlll[i] != 0;
   }

   public void iIlIlllllill() {
      this.liIlilIlll.set(0, this.IiIlilIlll.length);
   }

   public int IliIlllilIi() {
      return this.IiIlilIlll.length;
   }

   public void liiiIIllIl(int i) {
      if (i >= 0 && i < this.IiIlilIlll.length && !this.liIlilIlll.get(i)) {
         this.liIlilIlll.set(i);
         this.lIllilIlll++;
      }
   }

   public byte lIiiIiIlilli(int i) {
      this.iiIlilIlll++;
      return this.IiIlilIlll[i];
   }

   public int IlIlllIlilIl() {
      return this.iiIlilIlll;
   }

   public void IIIllIIliIIl(int c, byte i) {
      this.IiIlilIlll[c] = i;
      this.liIlilIlll.clear(c);
      this.IIllilIlll++;
   }

   public int IiIlliIliiIl() {
      return this.IIllilIlll;
   }

   public byte iliIiiliiiii(int i) {
      return this.IiIlilIlll[i];
   }
}
