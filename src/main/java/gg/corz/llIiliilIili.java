package gg.corz;

import java.util.List;

public record llIiliilIili(List<iIillIlIlillIl> slots, int pvp, int util) {
   private final int lIIiiIlIliIIiiIlIl;
   private final List<iIillIlIlillIl> IiiliIlIlliiliIlIl;
   private final int iiiliIlIlIIIiiIlIl;

   public llIiliilIili(List<iIillIlIlillIl> slots, int pvp, int util) {
      this.IiiliIlIlliiliIlIl = slots;
      this.iiiliIlIlIIIiiIlIl = pvp;
      this.lIIiiIlIliIIiiIlIl = util;
   }

   public int iliIiiliiiii() {
      return this.iiiliIlIlIIIiiIlIl;
   }

   public iIillIlIlillIl liiiIIllIl(int i) {
      return i >= 0 && i < this.IiiliIlIlliiliIlIl.size() ? this.IiiliIlIlliiliIlIl.get(i) : null;
   }

   public int iIlIlllllill(String id) {
      long var3 = -8207936528447422188L;
      if (id == null) {
         return -1;
      } else {
         for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < this.IiiliIlIlliiliIlIl.size(); var5 += 4294967296L) {
            if (this.IiiliIlIlliiliIlIl.get((int)(var5 >>> 32)).liiiIIllIl().equals(id)) {
               return (int)(var5 >>> 32);
            }
         }

         return -1;
      }
   }

   public int IIIllIIliIIl() {
      return this.lIIiiIlIliIIiiIlIl;
   }

   public int IliIlllilIi() {
      return this.IiiliIlIlliiliIlIl.size();
   }

   public List<iIillIlIlillIl> lIiiIiIlilli() {
      return this.IiiliIlIlliiliIlIl;
   }

   public int IilliliilIIi(ilIllIiIll m) {
      long var3 = -4446835807456578705L;
      if (m == null) {
         return -1;
      } else {
         for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < this.IiiliIlIlliiliIlIl.size(); var5 += 4294967296L) {
            if (this.IiiliIlIlliiliIlIl.get((int)(var5 >>> 32)).IilliliilIIi() == m) {
               return (int)(var5 >>> 32);
            }
         }

         return -1;
      }
   }
}
