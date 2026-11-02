package gg.corz;

import net.minecraft.class_1309;
import net.minecraft.class_1511;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_746;

final class IiiiliIiliiiliIi {
   boolean iIiiIiiIIi;
   final iIIlIIiIlIlIIi IlliIiiIIi;
   final ilIiliilIiIiliil IiIiIiiIIi;
   boolean iiliIiiIIi;
   final iiIllIlIIlllIl lIliIiiIIi;
   final IillIiillillIiil lIIiIiiIIi;
   final iIIlIIiIlIlIIi llliIiiIIi;
   boolean IliiIiiIIi;
   boolean lIiiIiiIIi;
   final float liIiIiiIIi;
   final int IiliIiiIIi;
   final iIIlIIiIlIlIIi iIliIiiIIi;
   final float iiIiIiiIIi;
   final int liliIiiIIi;
   final class_746 iIIiIiiIIi;
   final lIiillIiiIiillIi ilIiIiiIIi;
   final class_1309 llIiIiiIIi;
   final iIIlIIiIlIlIIi illiIiiIIi;
   final class_243 IlIiIiiIIi;
   boolean IIiiIiiIIi;
   final iiIllIlIIlllIl IIliIiiIIi;

   boolean IliIlllilIi(float full, float cost, boolean kills) {
      long var5 = 1813170640921875236L;
      if (this.IiIiIiiIIi.iiIIlIIlIl()) {
         return this.IiIiIiiIIi.lIiiIiIlilli(full, this.iiIiIiiIIi, this.IiIiIiiIIi.iliIiiliiiii(kills));
      } else {
         var5 ^= ((long)(full > 0.0F && full >= this.iiIiIiiIIi - 1.0F ? 1 : 0) << 32 ^ var5) & -1L << 32;
         return ((int)(var5 >>> 32) == 0 || this.lIIiIiiIIi.IIIIllIIIl() && kills) && cost <= this.lIIiIiiIIi.IlIlllIlilIl();
      }
   }

   double IiIlliIliiIl(class_243 point) {
      float[] var2 = ilIiiIiIii.Ililllililil(this.IlIiIiiIIi, point);
      return liiIIliliiiIIlil.Iilllilliill(this.lIIiIiiIIi.Iiilliiliiil(), this.lIIiIiiIIi.IIIilIIiiIIi(), var2[0], var2[1]);
   }

   boolean IlIlllIlilIl(class_243 centre) {
      return this.lIIiIiiIIi.iIIIlIlIIl() != null && this.lIIiIiiIIi.iIIIlIlIIl().test(centre);
   }

   float Illlllllilll(class_243 virtualSolid, class_2338 centre) {
      float var3 = lllIliIlillIliIl.IlIllllIll(this.iIIiIiiIIi, virtualSolid, this.iIIiIiiIIi.method_73189(), this.iIIiIiiIIi.method_5829(), centre, null, 6.0F);
      return this.lIIiIiiIIi.IIlilIliiIli() == null
         ? var3
         : Math.max(
            var3, lllIliIlillIliIl.IlIllllIll(this.iIIiIiiIIi, virtualSolid, this.IlliIiiIIi.IliIlllilIi(), this.IlliIiiIIi.liiiIIllIl(), centre, null, 6.0F)
         );
   }

   boolean IIIllIIliIIl(class_1511 crystal) {
      long var5 = -7291644872692649694L;
      if (crystal != null && crystal.method_5805() && !crystal.method_31481() && this.lIiiIiIlilli(crystal)) {
         var5 ^= ((long)crystal.method_5628() << 32 ^ var5) & -1L << 32;
         if (!this.lIIiIiiIIi.Illlllllilll().IIlilIliiIli((int)(var5 >>> 32), this.lIIiIiiIIi.Iilllilliill())
            && !this.lIIiIiiIIi.Illlllllilll().IiIiliIiiiIi((int)(var5 >>> 32), this.lIIiIiiIIi.IIillIiliIil(), this.lIIiIiiIIi.Ililllililil())) {
            class_238 var3 = crystal.method_5829();
            if (lllIliIlillIliIl.IIlilIliiIli(this.IlIiIiiIIi, var3) >= 3.0) {
               return false;
            } else if (lllIliIlillIliIl.Iiiiliiiiiii(var3, crystal, this.IlIiIiiIIi, this.lIIiIiiIIi.Iiilliiliiil(), this.lIIiIiiIIi.IIIilIIiiIIi(), 3.0)
               == null) {
               return false;
            } else if (this.IlIlllIlilIl(crystal.method_73189())) {
               return false;
            } else {
               IiIilIllliIilIll var4 = this.Ililllililil(crystal);
               return var4.IIIllIIliIIl()
                  && (
                     iiIiiliIIliili.Ililllililil(var4.IliIlllilIi(), var4.IilliliilIIi(), var4.iliIiiliiiii(), this.ilIiIiiIIi)
                        || this.IiIiIiiIIi.Ililllililil(var4.IliIlllilIi(), var4.IiIlliIliiIl(), var4.IilliliilIIi())
                  );
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   float IIillIiliIil(float sS, float knock, class_243 centre) {
      return !this.IiIiIiiIIi.iIIIlIlIIl()
         ? sS
         : this.IiIiIiiIIi
            .Iilililiiili(
               sS,
               iiIiiliIIliili.iIlIlllllill(knock, this.lIliIiiIIi, 6.0F),
               ilIiliilIiIiliil.IIiilIiiiIii(this.IlIiIiiIIi.field_1351 - centre.field_1351, this.IlIiIiiIIi.method_1022(centre))
            );
   }

   boolean IilliliilIIi(float full, float cost, float kills, float pops, boolean now, boolean dealt, boolean knock) {
      return this.IiIiIiiIIi.iiIIlIIlIl()
         ? this.IiIiIiiIIi.lIiiIiIlilli(full, this.iiIiIiiIIi, this.IiIiIiiIIi.IIIllIIliIIl(dealt, knock && now))
            && this.IiIiIiiIIi.IIlllIlliIll(kills, now, full, cost, false)
         : this.IiIiIiiIIi.IiIiliIiiiIi(kills, pops, now, this.liIiIiiIIi, full, cost, this.iiIiIiiIIi) || this.liiiIIllIl(full, cost, kills, now, dealt);
   }

   IiiiliIiliiiliIi(IillIiillillIiil r) {
      long var4 = 3352521251082894831L;
      super();
      this.lIIiIiiIIi = r;
      this.iIIiIiiIIi = Ililiiillliliiil.IIllilIiil.field_1724;
      this.IlIiIiiIIi = this.iIIiIiiIIi.method_33571();
      this.llIiIiiIIi = r.IilliliilIIi();
      this.ilIiIiiIIi = r.IiIiliIiiiIi() != null ? r.IiIiliIiiiIi() : lIiillIiiIiillIi.IliIlllilIi();
      this.IiIiIiiIIi = this.ilIiIiiIIi.lIilliIill();
      this.liIiIiiIIi = Float.isNaN(r.Iliilliiilii()) ? this.llIiIiiIIi.method_6032() + this.llIiIiiIIi.method_6067() : r.Iliilliiilii();
      this.iiIiIiiIIi = this.iIIiIiiIIi.method_6032() + this.iIIiIiiIIi.method_6067();
      this.IIliIiiIIi = lllIliIlillIliIl.iiiIlIIIll(this.llIiIiiIIi);
      this.lIliIiiIIi = lllIliIlillIliIl.iiiIlIIIll(this.iIIiIiiIIi);
      this.iIliIiiIIi = r.lIiiIiIlilli() != null ? r.lIiiIiIlilli() : new iIIlIIiIlIlIIi(this.llIiIiiIIi.method_73189(), this.llIiIiiIIi.method_5829());
      this.IlliIiiIIi = r.IIlilIliiIli() != null ? r.IIlilIliiIli() : new iIIlIIiIlIlIIi(this.iIIiIiiIIi.method_73189(), this.iIIiIiiIIi.method_5829());
      class_243 var2 = r.Illillliilli();
      var4 ^= ((long)(var2 != null && var2.method_1033() > 0.001 ? 1 : 0) << 32 ^ var4) & -1L << 32;
      this.llliIiiIIi = (int)(var4 >>> 32) != 0 ? lllIliIlillIliIl.IIllllIlll(this.iIliIiiIIi, var2) : null;
      this.illiIiiIIi = (int)(var4 >>> 32) != 0 ? lllIliIlillIliIl.IIllllIlll(this.iIliIiiIIi, var2.method_1021(-1.0)) : null;
      this.IiliIiiIIi = Math.max(0, r.Ililllililil());
      this.liliIiiIIi = this.IiliIiiIIi + 1;
   }

   boolean iIlIlllllill(float knock, float full, float pops, float dealt, boolean kills, boolean cost) {
      return this.IilliliilIIi(knock, full, pops, dealt, kills, cost, false);
   }

   IiIilIllliIilIll Ililllililil(class_1511 crystal) {
      long var17 = 8793961498727939133L;
      long var19 = -684634050970482581L;
      class_243 var2 = crystal.method_73189();
      float var3 = lllIliIlillIliIl.IlIllllIll(this.iIIiIiiIIi, var2, this.iIIiIiiIIi.method_73189(), this.iIIiIiiIIi.method_5829(), null, null, 6.0F);
      float var4 = iiIiiliIIliili.lIiiIiIlilli(var3, this.lIliIiiIIi);
      float var5 = iiIiiliIIliili.iliIiiliiiii(var3, this.lIliIiiIIi, this.lIIiIiiIIi.IIiilIiiiIii(), 0);
      float var6 = Ililiiillliliiil.Iliilliiilii(this.llIiIiiIIi, var2)
         ? 0.0F
         : lllIliIlillIliIl.IlIllllIll(this.llIiIiiIIi, var2, this.iIliIiiIIi.IliIlllilIi(), this.iIliIiiIIi.liiiIIllIl(), null, null, 6.0F);
      float var7 = iiIiiliIIliili.IilliliilIIi(var6, this.IIliIiiIIi, this.lIIiIiiIIi.Iilililiiili(), 0, this.IiIiIiiIIi.iIIIlIlIIl());
      float var8 = this.IiIiIiiIIi.iIIIlIlIIl() ? iiIiiliIIliili.iIlIlllllill(var6, this.IIliIiiIIi, 6.0F) : 0.0F;
      var17 ^= ((long)iiIiiliIIliili.IlIlllIlilIl(var7, this.liIiIiiIIi) << 32 ^ var17) & -1L << 32;
      var17 ^= ((long)((int)(var17 >>> 32) != 0 && !this.lIIiIiiIIi.Iiiiliiiiiii() ? 1 : 0) ^ var17) & -1L >>> 32;
      var19 ^= (
            (long)(
                     this.lIIiIiiIIi.Illlllllilll() != null
                           && this.lIIiIiiIIi
                              .Illlllllilll()
                              .IIillIiliIil(lllIliIlillIliIl.iliIiiliiiii(crystal).method_10063(), this.lIIiIiiIIi.Iilllilliill())
                        ? 1
                        : 0
                  )
                  << 32
               ^ var19
         )
         & -1L << 32;
      double var12 = iiIiiliIIliili.Iilllilliill((boolean)((int)(var19 >>> 32)), var4, var5, this.ilIiIiiIIi);
      var19 ^= (
            (long)this.IilliliilIIi(this.IiIiIiiIIi.IlIlllIlilIl(var4, var5), var5, var7, var8, (boolean)((int)(var17 >>> 32)), (boolean)((int)var17), true)
               ^ var19
         )
         & -1L >>> 32;
      if ((int)var19 == 0 && (int)(var19 >>> 32) == 0) {
         var19 ^= ((long)this.iliIiiliiiii(var4, var5, (boolean)((int)var17)) ^ var19) & -1L >>> 32;
      }

      double var15 = iiIiiliIIliili.IIillIiliIil(var7, (boolean)((int)(var17 >>> 32)), (boolean)((int)var17), var5, var12, this.ilIiIiiIIi)
         + Math.max(0.0, Ililiiillliliiil.Iilililiiili(this, var2))
         + (double)this.IiIiIiiIIi.Illillliilli(var8);
      return new IiIilIllliIilIll(var7, var4, var5, (boolean)((int)(var17 >>> 32)), (boolean)((int)var17), var12, (boolean)((int)var19), var15, var8);
   }

   boolean lIiiIiIlilli(class_1511 crystal) {
      return this.lIIiIiiIIi.Illlllllilll() != null
         && this.lIIiIiiIIi.Illlllllilll().IIillIiliIil(lllIliIlillIliIl.iliIiiliiiii(crystal).method_10063(), this.lIIiIiiIIi.Iilllilliill());
   }

   String Iiilliiliiil() {
      if (this.iiliIiiIIi) {
         return IIIilIIiiIIi<"IIIilIIiiIIi","HHZ2ZkWy01wzU+UOJJKMAW2H8nJrGfvJy5XW/+G8T2BFGPkG">();
      } else if (this.IIiiIiiIIi) {
         return IIIilIIiiIIi<"IIIilIIiiIIi","xIH51HF6Pmto+NcTuTuQgxmttwBLpMJgC+QbWkeom4merQ==">();
      } else if (this.lIiiIiiIIi) {
         return IIIilIIiiIIi<"IIIilIIiiIIi","EGjPhfFrIbtRo5Rv9P6Bm3k2Sgq775W6XXaoXQzktmpIv8h8V0z4wg==">();
      } else if (this.lIIiIiiIIi.IiIlliIliiIl() && !this.lIIiIiiIIi.IIlllIlliIll()) {
         return IIIilIIiiIIi<"IIIilIIiiIIi","I3ujDrg8u9Dpe4J/KTQKQ08xOhBHdOsLuJuB51hU8MB/9p9scWQ2">();
      } else if (!lllIliIlillIliIl.IlIlllIlilIl()) {
         return IIIilIIiiIIi<"IIIilIIiiIIi","C5TH0IeJFcYhq1BeuR1dRocToqeUJKrOU3S4bZOSgXShRW7kDYNi">();
      } else if (this.iIiiIiiIIi) {
         return IIIilIIiiIIi<"IIIilIIiiIIi","PudCRdMANIfaKdSkjqtKGMYDfIL022TUclZbrZ9r7Ls=">();
      } else {
         return this.IliiIiiIIi
            ? IIIilIIiiIIi<"IIIilIIiiIIi","NWyi0ashLF8L6TAB0vOqXV1RiAcnADPBre5Bt+l6qsKDAs1rxA==">()
            : IIIilIIiiIIi<"IIIilIIiiIIi","itv26wIJ51+tdNsIgnoEVe4Rq+AfYjd+D1F2nAkW/U9tZY8=">();
      }
   }

   float IIlllIlliIll(class_243 centre, class_2338 virtualSolid, boolean robust) {
      if (Ililiiillliliiil.Iliilliiilii(this.llIiIiiIIi, centre)) {
         return 0.0F;
      } else {
         float var4 = lllIliIlillIliIl.IlIllllIll(
            this.llIiIiiIIi, centre, this.iIliIiiIIi.IliIlllilIi(), this.iIliIiiIIi.liiiIIllIl(), virtualSolid, null, 6.0F
         );
         if (robust && this.llliIiiIIi != null) {
            float var5 = lllIliIlillIliIl.IlIllllIll(
               this.llIiIiiIIi, centre, this.llliIiiIIi.IliIlllilIi(), this.llliIiiIIi.liiiIIllIl(), virtualSolid, null, 6.0F
            );
            float var6 = lllIliIlillIliIl.IlIllllIll(
               this.llIiIiiIIi, centre, this.illiIiiIIi.IliIlllilIi(), this.illiIiiIIi.liiiIIllIl(), virtualSolid, null, 6.0F
            );
            return 0.5F * var4 + 0.25F * var5 + 0.25F * var6;
         } else {
            return var4;
         }
      }
   }

   boolean iliIiiliiiii(float kills, float cost, boolean full) {
      return this.IiIiIiiIIi.IiIlliIliiIl(kills, cost)
         && this.IiIiIiiIIi.lIiiIiIlilli(this.IiIiIiiIIi.IlIlllIlilIl(kills, cost), this.iiIiIiiIIi, this.IiIiIiiIIi.iliIiiliiiii(full));
   }

   ililIiilIiilIiil Iilllilliill(class_243 minFilter, class_2338 land, boolean centre, int virtualSolid, boolean robust) {
      long var14 = 1375304071368499604L;
      float var6 = this.IIlllIlliIll(minFilter, land, centre);
      float var7 = iiIiiliIIliili.IilliliilIIi(var6, this.IIliIiiIIi, this.lIIiIiiIIi.Iilililiiili(), virtualSolid, this.IiIiIiiIIi.iIIIlIlIIl());
      float var8 = this.IiIiIiiIIi.iIIIlIlIIl() ? iiIiiliIIliili.iIlIlllllill(var6, this.IIliIiiIIi, 6.0F) : 0.0F;
      var14 ^= ((long)iiIiiliIIliili.IlIlllIlilIl(var7, this.liIiIiiIIi) << 32 ^ var14) & -1L << 32;
      var14 ^= ((long)((int)(var14 >>> 32) != 0 && !this.lIIiIiiIIi.Iiiiliiiiiii() ? 1 : 0) ^ var14) & -1L >>> 32;
      if (robust && var7 < this.ilIiIiiIIi.Iiiiliiiiiii() && (int)(var14 >>> 32) == 0 && !this.IiIiIiiIIi.Ililllililil(var7, var8, false)) {
         this.iiliIiiIIi = true;
         return null;
      } else {
         float var11 = this.Illlllllilll(minFilter, land);
         float var12 = iiIiiliIIliili.lIiiIiIlilli(var11, this.lIliIiiIIi);
         float var13 = iiIiiliIIliili.iliIiiliiiii(var11, this.lIliIiiIIi, this.lIIiIiiIIi.IIiilIiiiIii(), virtualSolid);
         return new ililIiilIiilIiil(var7, var12, var13, (boolean)((int)(var14 >>> 32)), (boolean)((int)var14), this.IIillIiliIil(var8, var11, minFilter));
      }
   }

   boolean liiiIIllIl(float pops, float cost, float dealt, boolean kills, boolean full) {
      if (this.IiIiIiiIIi.iiIIlIIlIl()) {
         return this.IiIiIiiIIi.lIiiIiIlilli(pops, this.iiIiIiiIIi, this.IiIiIiiIIi.iliIiiliiiii(full));
      } else {
         return !this.ilIiIiiIIi.iIlllIllll()
            ? this.IliIlllilIi(pops, cost, full)
            : iiIiiliIIliili.IiIlliIliiIl(
                  dealt, cost, pops, kills, full, this.lIIiIiiIIi.IIIIllIIIl(), this.ilIiIiiIIi.Iillllilll(), this.iiIiIiiIIi, this.ilIiIiiIIi.lllllillll()
               )
               && cost <= this.lIIiIiiIIi.IlIlllIlilIl();
      }
   }
}
