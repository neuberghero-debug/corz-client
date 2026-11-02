package gg.corz;

import java.util.List;
import java.util.Objects;

final class llIiiIlilIiiIl {
   final String iIIiliillIlIiliill;
   iliiiIiiii iiIiliillIIliliill;
   float Illiliillllliliill;
   List<iIiiiilIliiiil> Iiiiliillliiiliill;
   int illiliillIililiill;
   List<iIIIIIliIlIIIIli> iiiiliillIIIIiiill;
   int lililiilliililiill;
   String llIiliillilIiliill;
   long iIiiliillIliiliill;
   float lIliliilliIliliill;
   String IiIiliillliIiliill;
   float[] lliiliilliliiliill;
   int IIiiliilllIiiliill;

   void IliIlllilIi() {
      this.lIliliilliIliliill = 0.0F;
      this.illiliillIililiill = 0;
      this.iIlIlllllill();
   }

   llIiiIlilIiiIl(final ilillllIiillll param1, String item) {
      this.lIIIiiilliIIIiiill = var1;
      this.lliiliilliliiliill = ilillllIiillll.iiIilIIIiIIlilIIIi;
      this.Iiiiliillliiiliill = List.of();
      this.iiiiliillIIIIiiill = List.of();
      this.iIIiliillIlIiliill = item;
      this.llIiliillilIiliill = item;
   }

   void IilliliilIIi(int k) {
      String var2;
      float var3;
      float var4;
      if (!this.Iiiiliillliiiliill.isEmpty()) {
         if (k < 0 || k >= this.Iiiiliillliiiliill.size()) {
            return;
         }

         iIiiiilIliiiil var5 = this.Iiiiliillliiiliill.get(k);
         var2 = var5.liiiIIllIl();
         var3 = var5.iIlIlllllill();
         var4 = var5.IilliliilIIi();
      } else {
         if (k < 0 || k >= this.iiiiliillIIIIiiill.size()) {
            return;
         }

         iIIIIIliIlIIIIli var6 = this.iiiiliillIIIIiiill.get(k);
         var2 = var6.liiiIIllIl();
         var3 = var6.iIlIlllllill();
         var4 = var6.IilliliilIIi();
      }

      IIiiIIlilIiiIIli.liiiIIllIl(
         this.lIIIiiilliIIIiiill.IIiilIIIilIiilIIIi.llliiillii(),
         var2,
         var3 * this.lIIIiiilliIIIiiill.IIiilIIIilIiilIIIi.Iiliililii() * 0.6F,
         var4,
         this.iIiiliillIliiliill
      );
   }

   void iIlIlllllill() {
      long var4 = 5806473689136608980L;
      this.llIiliillilIiliill = this.iIIiliillIlIiliill;
      if (lIiiIiIlilli<"lIiiIiIlilli","FtESjSf0aAudYClbiqGirzcJsiA9jZSRFgTfSaYAN9afaQ==">().equals(this.iIIiliillIlIiliill)) {
         String[] var1 = this.lIIIiiilliIIIiiill.IIiilIIIilIiilIIIi.IlIiillIii() ? ilillllIiillll.iIIilIIIiIlIilIIIi : ilillllIiillll.IiIilIIIiliIilIIIi;
         this.llIiliillilIiliill = var1[Math.floorMod(this.illiliillIililiill, var1.length)];
      }

      this.IiIiliillliIiliill = null;
      this.iiIiliillIIliliill = null;
      this.Iiiiliillliiiliill = List.of();
      this.iiiiliillIIIIiiill = List.of();
      this.lililiilliililiill = 0;
      this.IIiiliilllIiiliill = 0;
      iiIiliiIIlilii var6 = ilillllIiillll.IiIilliIil(this.llIiliillilIiliill);
      if (var6 != null) {
         List var2 = llIiilIiilIiilIi.IiIlliIliiIl(var6);
         this.IIiiliilllIiiliill = var2.size();
         if (this.IIiiliilllIiiliill > 0) {
            this.lililiilliililiill = Math.floorMod(
               lIiiIiIlilli<"lIiiIiIlilli","FtESjSf0aAudYClbiqGirzcJsiA9jZSRFgTfSaYAN9afaQ==">().equals(this.iIIiliillIlIiliill)
                  ? this.illiliillIililiill / ilillllIiillll.iIIilIIIiIlIilIIIi.length
                  : this.illiliillIililiill,
               this.IIiiliilllIiiliill
            );
            this.IiIiliillliIiliill = (String)var2.get(this.lililiilliililiill);
            this.Illiliillllliliill = llIiilIiilIiilIi.Illlllllilll(var6, this.IiIiliillliIiliill);
            this.Iiiiliillliiiliill = llIiilIiilIiilIi.IIillIiliIil(var6, this.IiIiliillliIiliill);
         } else {
            this.Illiliillllliliill = IIlllIIilIlllIIi.lilliiilli(lIiiIiIlilli<"lIiiIiIlilli","zFFnZlHC/2imqAV92ZCOYIjtx680xzoSPszXeoQPQhCivoyf7w==">());
         }
      } else if (iliiiIiiii.lIiiIiIlilli(this.llIiliillilIiliill)) {
         this.iiIiliillIIliliill = IIlllIIilIlllIIi.IIililIili(this.llIiliillilIiliill);
         this.Illiliillllliliill = IIlllIIilIlllIIi.lilliiilli(this.llIiliillilIiliill);
         this.iiiiliillIIIIiiill = iilliliIIilili.IilliliilIIi(this.llIiliillilIiliill, this.iiIiliillIIliliill, (double)this.Illiliillllliliill);
      } else {
         this.Illiliillllliliill = IIlllIIilIlllIIi.lilliiilli(this.llIiliillilIiliill);
      }

      var4 ^= ((long)(this.Iiiiliillliiiliill.isEmpty() ? this.iiiiliillIIIIiiill.size() : this.Iiiiliillliiiliill.size()) << 32 ^ var4) & -1L << 32;
      this.lliiliilliliiliill = (int)(var4 >>> 32) == 0 ? ilillllIiillll.iiIilIIIiIIlilIIIi : new float[(int)(var4 >>> 32)];

      for (long var8 = var4 ^ (0L ^ var4) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         this.lliiliilliliiliill[(int)var8] = this.Iiiiliillliiiliill.isEmpty()
            ? this.iiiiliillIIIIiiill.get((int)var8).IliIlllilIi() * this.Illiliillllliliill
            : this.Iiiiliillliiiliill.get((int)var8).IliIlllilIi();
      }

      this.iIiiliillIliiliill = IIiiIIlilIiiIIli.IilliliilIIi();
   }

   void liiiIIllIl(float dt) {
      iiIiliiIIlilii var2 = ilillllIiillll.IiIilliIil(this.llIiliillilIiliill);
      if (var2 != null && this.IiIiliillliIiliill == null && llIiilIiilIiilIi.lIiiIiIlilli(var2)) {
         this.lIliliilliIliliill = 0.0F;
         this.iIlIlllllill();
         if (this == this.lIIIiiilliIIIiiill.lliilIIIiiliilIIIi[Math.max(0, this.lIIIiiilliIIIiiill.lIiIiIIIiiIiIiIIIi)]) {
            ilillllIiillll.Illillllil(this.lIIIiiilliIIIiiill).Ililllililil();
         }
      }

      this.lIliliilliIliliill += dt;
      float var3 = 0.35F + this.Illiliillllliliill + 0.8F;
      if (this.lIliliilliIliliill >= var3) {
         this.lIliliilliIliliill -= var3;
         this.illiliillIililiill++;
         String var4 = this.llIiliillilIiliill;
         this.iIlIlllllill();
         if (!Objects.equals(var4, this.llIiliillilIiliill)
            && this.lIIIiiilliIIIiiill.lIiIiIIIiiIiIiIIIi >= 0
            && this == this.lIIIiiilliIIIiiill.lliilIIIiiliilIIIi[this.lIIIiiilliIIIiiill.lIiIiIIIiiIiIiIIIi]) {
            ilillllIiillll.illilIilil(this.lIIIiiilliIIIiiill).Ililllililil();
         }
      }
   }
}
