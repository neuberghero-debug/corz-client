package gg.corz;

import java.util.ArrayList;
import java.util.List;

public final class llIIliilIIli {
   public final int[] IIliilIIllIliilIIl;
   private static final int IlIiilIIlllIiilIIl = 2;
   private final List<iIlIliilIllIliil> lIiiilIIliIiiilIIl;
   public final int liIiilIIliiIiilIIl;
   private int IiliilIIlliliilIIl;
   final iIlIliilIllIliil IliiilIIllliiilIIl;
   public final boolean iIliilIIlIlliilIIl;
   private int iiliilIIlIIiiilIIl;
   public final int ilIiilIIlIiIiilIIl;
   private int llliilIIlilliilIIl = 2;

   void iIlIlllllill() {
      if (!this.iIliilIIlIlliilIIl) {
         for (iIlIliilIllIliil var2 : this.lIiiilIIliIiiilIIl) {
            this.IilliliilIIi(var2);
         }
      }
   }

   public llIIliilIIli(int height, int width) {
      this(height, width, false);
   }

   private void IilliliilIIi(iIlIliilIllIliil r) {
      long var6 = -7865418754313131567L;
      long var8 = 6186609970579735459L;

      for (long var10 = var6 ^ ((long)(r.lIiilIilil - 2) << 32 ^ var6) & -1L << 32; (int)(var10 >>> 32) < r.lIiilIilil + r.IliilIilil + 2; var10 += 4294967296L) {
         if ((int)(var10 >>> 32) >= 0 && (int)(var10 >>> 32) < this.liIiilIIliiIiilIIl) {
            var10 ^= ((long)Math.max(r.lIiilIilil, Math.min(r.lIiilIilil + r.IliilIilil - 1, (int)(var10 >>> 32))) ^ var10) & -1L >>> 32;

            for (var8 ^= ((long)(r.IIiilIilil - 2) << 32 ^ var8) & -1L << 32; (int)(var8 >>> 32) < r.IIiilIilil + r.iIiilIilil + 2; var8 += 4294967296L) {
               if ((int)(var8 >>> 32) >= 0
                  && (int)(var8 >>> 32) < this.ilIiilIIlIiIiilIIl
                  && (
                     (int)(var8 >>> 32) < r.IIiilIilil
                        || (int)(var8 >>> 32) >= r.IIiilIilil + r.iIiilIilil
                        || (int)(var10 >>> 32) < r.lIiilIilil
                        || (int)(var10 >>> 32) >= r.lIiilIilil + r.IliilIilil
                  )) {
                  var8 ^= ((long)Math.max(r.IIiilIilil, Math.min(r.IIiilIilil + r.iIiilIilil - 1, (int)(var8 >>> 32))) ^ var8) & -1L >>> 32;
                  this.IIliilIIllIliilIIl[(int)(var10 >>> 32) * this.ilIiilIIlIiIiilIIl + (int)(var8 >>> 32)] = this.IIliilIIllIliilIIl[(int)var10
                        * this.ilIiilIIlIiIiilIIl
                     + (int)var8];
               }
            }
         }
      }
   }

   llIIliilIIli(int width, int height, boolean dry) {
      this.IiliilIIlliliilIIl = 2;
      this.lIiiilIIliIiiilIIl = new ArrayList<>();
      this.ilIiilIIlIiIiilIIl = width;
      this.liIiilIIliiIiilIIl = height;
      this.iIliilIIlIlliilIIl = dry;
      this.IIliilIIllIliilIIl = dry ? new int[0] : new int[width * height];
      this.IliiilIIllliiilIIl = this.IliIlllilIi(4, 4);
      this.IliiilIIllliiilIIl.IliIlllilIi().IilliliilIIi(-1);
   }

   public int liiiIIllIl() {
      return this.IiliilIIlliliilIIl + this.iiliilIIlIIiiilIIl + 2;
   }

   public iIlIliilIllIliil IliIlllilIi(int w, int h) {
      if (w >= 1 && h >= 1) {
         if (w + 4 <= this.ilIiilIIlIiIiilIIl && h + 4 <= this.liIiilIIliiIiilIIl) {
            if (this.llliilIIlilliilIIl + w + 2 > this.ilIiilIIlIiIiilIIl) {
               this.llliilIIlilliilIIl = 2;
               this.IiliilIIlliliilIIl = this.IiliilIIlliliilIIl + this.iiliilIIlIIiiilIIl + 4;
               this.iiliilIIlIIiiilIIl = 0;
            }

            if (this.IiliilIIlliliilIIl + h + 2 > this.liIiilIIliiIiilIIl) {
               throw new IllegalStateException(
                  lIiiIiIlilli<"lIiiIiIlilli","YFo5wUA96nIiVXk36a5+ZE3jyDRy8NoH90799DotvLDnsQ==">()
                     + this.ilIiilIIlIiIiilIIl
                     + lIiiIiIlilli<"lIiiIiIlilli","aYxyoJgwaU6+3EA7OymDdPIMzEddJIXus+Aph/4=">()
                     + this.liIiilIIliiIiilIIl
                     + lIiiIiIlilli<"lIiiIiIlilli","lcr9Q34xdcnps4H2gwyYRcEpaYf8KkiAGnGzpcfVMkK5Hd+9o37pq6G1ZkFHjwkxzIlI0A==">()
               );
            } else {
               iIlIliilIllIliil var3 = new iIlIliilIllIliil(this, this.llliilIIlilliilIIl, this.IiliilIIlliliilIIl, w, h);
               this.lIiiilIIliIiiilIIl.add(var3);
               this.llliilIIlilliilIIl += w + 4;
               this.iiliilIIlIIiiilIIl = Math.max(this.iiliilIIlIIiiilIIl, h);
               return var3;
            }
         } else {
            throw new IllegalStateException(
               lIiiIiIlilli<"lIiiIiIlilli","O0epZoPWUY0UsK33DOy91nijG6Zflz+zGfpdWJjD+DRb5N8=">()
                  + w
                  + lIiiIiIlilli<"lIiiIiIlilli","aYxyoJgwaU6+3EA7OymDdPIMzEddJIXus+Aph/4=">()
                  + h
                  + lIiiIiIlilli<"lIiiIiIlilli","X8nWdQaJD63Mn0DFQ/yc2kPVU5xuc8mlknWjIvQYKd1/xM7hCJZYGNW6k/BGm38=">()
                  + this.ilIiilIIlIiIiilIIl
                  + lIiiIiIlilli<"lIiiIiIlilli","aYxyoJgwaU6+3EA7OymDdPIMzEddJIXus+Aph/4=">()
                  + this.liIiilIIliiIiilIIl
            );
         }
      } else {
         throw new IllegalArgumentException(
            lIiiIiIlilli<"lIiiIiIlilli","O0epZoPWUY0UsK33DOy91nijG6Zflz+zGfpdWJjD+DRb5N8=">()
               + w
               + lIiiIiIlilli<"lIiiIiIlilli","aYxyoJgwaU6+3EA7OymDdPIMzEddJIXus+Aph/4=">()
               + h
         );
      }
   }
}
