package gg.corz;

import java.util.Locale;

final class IIliliillIliliil {
   String iIiiIIIiil;
   final IIIlliIllIIlliIl lIliIIIiil;
   Runnable IIiiIIIiil;
   String lIiiIIIiil = "";
   final String llliIIIiil;
   final String IiliIIIiil;
   float liiiIIIiil;
   float iliiIIIiil;
   final String IlliIIIiil;
   final boolean iiliIIIiil;
   String IliiIIIiil;
   String lliiIIIiil;
   final String iIliIIIiil;
   float IiiiIIIiil;
   final String illiIIIiil;
   final String liliIIIiil;

   void IliIlllilIi(IIliiIlllIliiIll nameW, float font, float lineW) {
      if (font != this.iliiIIIiil || lineW != this.IiiiIIIiil) {
         this.iliiIIIiil = font;
         this.IiiiIIIiil = lineW;
         this.lIiiIIIiil = nameW.Iiilliiliiil(this.lIliIIIiil.liiiIIllIl(), font);
         this.iIiiIIIiil = this.lIliIIIiil.IilliliilIIi().isEmpty() ? "" : nameW.Iiilliiliiil(this.lIliIIIiil.IilliliilIIi(), (font - 10.0F) / 0.78F);
         this.IliiIIIiil = nameW.Iiilliiliiil(
            this.lIliIIIiil.lIiiIiIlilli().isEmpty()
               ? liiiIIllIl<"liiiIIllIl","iLVSzRzlcHazSZrEWuErHPinRWt3UAN2iYnj1GF59nthOnLPlh+5Bs4mEg==">()
               : this.lIliIIIiil.lIiiIiIlilli(),
            lineW / 0.82F
         );
         this.lliiIIIiil = llilliilililliil.IiIilliIil(this.IiliIIIiil) <= lineW ? this.IiliIIIiil : this.liliIIIiil;
         this.liiiIIIiil = nameW.iIlIlllllill(this.illiIIIiil);
      }
   }

   IIliliillIliliil(IIIlliIllIIlliIl station, int index) {
      this.iIiiIIIiil = "";
      this.IliiIIIiil = "";
      this.lliiIIIiil = "";
      this.iliiIIIiil = -1.0F;
      this.IiiiIIIiil = -1.0F;
      this.lIliIIIiil = station;
      this.iIliIIIiil = liiiIIllIl<"liiiIIllIl","TMDiYTXahs3E5dnA3VyNzw3geYTG8AbK4I/PUVfH3FQp">() + index;
      this.IlliIIIiil = liiiIIllIl<"liiiIIllIl","by8Ctev3+xmR35I6jaTaN6eEtKhwSm57rKObRSlZ+9YX">() + index;
      this.llliIIIiil = liiiIIllIl<"liiiIIllIl","2UVKzq0qDrPzTEM77XshAp6Klt+kR2Ev++KPdkWgZQ==">() + index;
      this.illiIIIiil = station.liiiIIllIl().substring(0, 1).toUpperCase(Locale.ROOT);
      this.iiliIIIiil = station.IilliliilIIi().equalsIgnoreCase(liiiIIllIl<"liiiIIllIl","4RBKcqG9g1s4EU5kH5gnJdmpu0yysVa9Tfl37oktA4UZ">())
         || station.IilliliilIIi().equalsIgnoreCase(liiiIIllIl<"liiiIIllIl","0baojcE4qNLMwQXcKe/OQMbcoV5bNC8678XehmQUagyI77A=">());
      String var3 = station.IIIllIIliIIl() <= 0
         ? ""
         : (
            station.IIIllIIliIIl() == 1
               ? liiiIIllIl<"liiiIIllIl","kGMvAsp0yAcEpTpsrQvsrX+ApxKVCOOXvDBAV/VkjO5bqBE=">()
               : station.IIIllIIliIIl() + liiiIIllIl<"liiiIIllIl","nPMVF8QLtB2gciPYBNWgT2DKMRHqxABOeYHKSO5exkBJ038=">()
         );
      String var4 = station.IlIlllIlilIl();
      if (!var3.isEmpty() && !var4.isEmpty()) {
         this.IiliIIIiil = var3 + liiiIIllIl<"liiiIIllIl","LUToDPTEZaSdDzgRm1AbUYR9OheTSEI3pWVSLDPccBI=">() + var4;
         this.liliIIIiil = var3;
      } else if (var3.isEmpty() && var4.isEmpty()) {
         this.IiliIIIiil = llllIIIlilllIIIl.Iiilliiliiil(station.iliIiiliiiii());
         this.liliIIIiil = this.IiliIIIiil;
      } else {
         this.IiliIIIiil = var3.isEmpty() ? var4 : var3;
         this.liliIIIiil = this.IiliIIIiil;
      }
   }
}
