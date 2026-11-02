package gg.corz;

public final class IilIllililIlli {
   private int IIlIilIIIl;
   private long iIlIilIIIl;
   private final int iiIIilIIIl;
   private long IllIilIIIl;
   private final int liIIilIIIl;
   private int lIlIilIIIl;

   public int IIIllIIliIIl() {
      return this.liIIilIIIl;
   }

   public int iIlIlllllill() {
      return this.IIlIilIIIl;
   }

   public int IlIlllIlilIl() {
      return this.iiIIilIIIl;
   }

   public void IliIlllilIi() {
      this.IIlIilIIIl = 0;
      this.lIlIilIIIl = 0;
   }

   public int IilliliilIIi() {
      return this.lIlIilIIIl;
   }

   public long lIiiIiIlilli() {
      return this.iIlIilIIIl;
   }

   public long iliIiiliiiii() {
      return this.IllIilIIIl;
   }

   public IilIllililIlli(int hard, int soft) {
      this.liIIilIIIl = Math.max(0, hard);
      this.iiIIilIIIl = Math.max(this.liIIilIIIl, soft);
   }

   public boolean liiiIIllIl(int rays, int priority) {
      long var5 = 6145473399873420819L;
      var5 ^= ((long)Math.max(0, rays) << 32 ^ var5) & -1L << 32;
      if (priority <= 1) {
         var5 ^= (1L ^ var5) & -1L >>> 32;
      } else if (priority == 2) {
         var5 ^= ((long)(this.IIlIilIIIl + (int)(var5 >>> 32) <= this.iiIIilIIIl ? 1 : 0) ^ var5) & -1L >>> 32;
      } else {
         var5 ^= ((long)(this.IIlIilIIIl + (int)(var5 >>> 32) <= this.liIIilIIIl ? 1 : 0) ^ var5) & -1L >>> 32;
      }

      if ((int)var5 != 0) {
         this.IIlIilIIIl += (int)(var5 >>> 32);
         this.iIlIilIIIl += (long)((int)(var5 >>> 32));
      } else {
         this.lIlIilIIIl++;
         this.IllIilIIIl++;
      }

      return (boolean)((int)var5);
   }
}
