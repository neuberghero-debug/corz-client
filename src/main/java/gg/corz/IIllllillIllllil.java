package gg.corz;

public final class IIllllillIllllil {
   public final float[] iliiIiiIil;
   public final float[] lliiIiiIil;

   public static IIllllillIllllil IliIlllilIi(int xs, int[] zs, int[] ys, int[] count, IillIillillIil cells) {
      llllIililllIil var5 = new llllIililllIil(xs, zs, ys, count, cells);
      return new IIllllillIllllil(var5.edges(), var5.faces());
   }

   private IIllllillIllllil(float[] quads, float[] lines) {
      this.lliiIiiIil = quads;
      this.iliiIiiIil = lines;
   }
}
