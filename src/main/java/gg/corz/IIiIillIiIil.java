package gg.corz;

public final class IIiIillIiIil {
   private int IIIiiIlilIIiiIli;
   private long liiliIliiiiliIli;

   public void IliIlllilIi(int sz, int stateToken, int sy, int sx) {
      long var5 = (long)sz * 73856093L ^ (long)stateToken * 19349663L ^ (long)sy * 83492791L;
      long var7 = var5 * -7046029254386353131L + ((long)sx & 4294967295L);
      var7 ^= var7 >>> 29;
      var7 *= -4658895280553007687L;
      var7 ^= var7 >>> 32;
      this.liiliIliiiiliIli += var7;
      this.IIIiiIlilIIiiIli++;
   }

   public long iIlIlllllill() {
      return this.liiliIliiiiliIli * -7046029254386353131L ^ (long)this.IIIiiIlilIIiiIli * 1099511628211L;
   }

   public int liiiIIllIl() {
      return this.IIIiiIlilIIiiIli;
   }
}
