package gg.corz;

public final class IiIiliIiliIiliIi {
   public static final int iliiiliIIi = 1536;
   public static final int IiiiiliIIi = 128;
   public final int IIIIIiiIIi;
   public final int liiiiliIIi;
   public final int iiiiiliIIi;

   public static IiIiliIiliIiliIi IliIlllilIi(int minLength) {
      return new IiIiliIiliIiliIi(minLength, 1536, 128);
   }

   public IiIiliIiliIiliIi(int minLength, int maxExtent, int maxCells) {
      this.liiiiliIIi = Math.max(4, minLength);
      this.iiiiiliIIi = Math.max(8, maxExtent);
      this.IIIIIiiIIi = Math.max(8, Math.min(250, maxCells));
   }
}
