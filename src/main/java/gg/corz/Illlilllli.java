package gg.corz;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_2596;
import net.minecraft.class_2664;
import net.minecraft.class_2743;
import net.minecraft.class_742;
import net.minecraft.class_746;

public class Illlilllli extends ilIllIiIll implements lIlliiIlli {
   private final iiIiiilIIliiil lIiliIIliIiliIIl;
   private static final double IlIliIIlllIliIIl = 45.0;
   private final Iiiliillliiliill iilliIIlIIiliIIl;
   private class_746 IIIiiIIllIIiiIIl;
   private static final double lIIliIIliIIliIIl = 5.0;
   private static final long liIliIIliiIliIIl = 475L;
   private volatile long ililiIIlIiiliIIl;
   private volatile long liiliIIliiiliIIl;
   private int iIIiiIIlIlIiiIIl;
   private static final long iIlliIIlIllliIIl = 150L;
   private boolean iiIiiIIlIIliiIIl;
   private volatile IIIIIIIllIIIIIIl IliliIIllliliIIl;
   private static final double ilIliIIlIiIliIIl = 90.0;
   private static final long IIlliIIllIlliIIl = 500L;
   private final Iiiliillliiliill IilliIIllilliIIl;
   private final iilliIlIIiliIl lllliIIlillliIIl = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","lKPLX/uuHxeTwSO2Y30pV8Nm5HaNEP1MQ+6cXLa3npF5zA==">(),
      IliIlllilIi<"IliIlllilIi","2NbvAywGm/dBe1yHD2vmFa51UVA0y6BdhGB7tgqcOuGSReh8VirKcPpb9Bh9zirzcoW+g7vFhRi2TpU6+aELSqqV">(),
      40,
      0,
      100
   );
   private long llIiiIIlilIiiIIl;
   private boolean IiIiiIIlliIiiIIl;

   @Override
   public long iiiIlIIIll(class_2596<?> packet, boolean queued, long nowMs) {
      long var10 = -993318201141670802L;
      IIIIIIIllIIIIIIl var5 = this.IliliIIllliliIIl;
      if (var5 != null && illllIlIilllIl.Iilllilliill(nowMs, this.ililiIIlIiiliIIl, 1406118633106900198L ^ 1406118633106900285L)) {
         var10 ^= ((long)var5.IliIlllilIi() << 32 ^ var10) & -1L << 32;
         if (!IIIiillllIIiilll.iliIiiliiiii(packet, q -> IIllllIlll(q, self))) {
            return 0L;
         } else if (!illllIlIilllIl.IIillIiliIil(nowMs, illIllilIilIllil.Illlllllilll((int)(var10 >>> 32)), 90409681870100682L ^ 90409681870100572L)) {
            return 0L;
         } else {
            ThreadLocalRandom var7 = ThreadLocalRandom.current();
            if (!illllIlIilllIl.IliIlllilIi((double)var5.liiiIIllIl(), var7.nextDouble())) {
               return 0L;
            } else {
               long var8 = illllIlIilllIl.Iiilliiliiil(
                  var5.iIlIlllllill(),
                  var5.IilliliilIIi(),
                  var5.lIiiIiIlilli(),
                  var5.iliIiiliiiii(),
                  var5.IIIllIIliIIl(),
                  var7.nextDouble(),
                  -7368688479364135110L ^ -7368688479364135218L
               );
               if (var8 <= (303349081733610763L ^ 303349081733610763L)) {
                  return 0L;
               } else {
                  this.ililiIIlIiiliIIl = nowMs;
                  this.liiliIIliiiliIIl = nowMs;
                  return nowMs + var8;
               }
            }
         }
      } else {
         return 0L;
      }
   }

   @Override
   protected void Iilililiiili() {
      this.IliliIIllliliIIl = null;
      iillIlllIIilIlll.lIiiIiIlilli(this);
      this.liIlliiIll();
   }

   private void ilIllIiIll(class_746 player) {
      long var2 = this.liiliIIliiiliIIl;
      if (var2 >= (-4788780427776573137L ^ -4788780427776573137L)) {
         if (var2 != this.llIiiIIlilIiiIIl) {
            this.llIiiIIlilIiiIIl = var2;
            this.IiIiiIIlliIiiIIl = false;
            this.iiIiiIIlIIliiIIl = false;
         }

         if (!this.IiIiiIIlliIiiIIl && iillIlllIIilIlll.liiiIIllIl(this)) {
            if (player.field_6235 > 0) {
               this.iiIiiIIlIIliiIIl = true;
            }

            if (illllIlIilllIl.IIIilIIiiIIi(
               this.iiIiiIIlIIliiIIl, player.field_6235, IIIiillllIIiilll.IliIlllilIi() - var2, 8596105689352046813L ^ 8596105689352046889L
            )) {
               this.IiIiiIIlliIiiIIl = true;
               iillIlllIIilIlll.lIiiIiIlilli(this);
            }
         }
      }
   }

   private static boolean IIllllIlll(class_2596<?> packet, int selfId) {
      if (packet instanceof class_2743 var3) {
         return var3.method_11818() == selfId;
      } else {
         if (packet instanceof class_2664 var2 && var2.comp_2884().isPresent()) {
            return true;
         }

         return false;
      }
   }

   private boolean IlIllllIll(class_746 self) {
      double var2 = ilIiiIiIii.IiIlliIliiIl() ? (double)ilIiiIiIii.Iilllilliill() : (double)self.method_36454();

      for (class_742 var5 : Iiiilllliiilll.field_1687.method_18456()) {
         if (var5 != self
            && liiIIIlliiiIIIll.IliIlllilIi(var5, lilllliiilllli.iiIiIiIIIl)
            && !((double)self.method_5739(var5) >= 5.0)
            && illllIlIilllIl.iliIiiliiiii(var2, self.method_23317(), self.method_23321(), var5.method_23317(), var5.method_23321(), 45.0)
            && illllIlIilllIl.iliIiiliiiii(
               (double)var5.method_36454(), var5.method_23317(), var5.method_23321(), self.method_23317(), self.method_23321(), 90.0
            )) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void iIIIlIlIIl() {
      class_746 var1 = Iiiilllliiilll.field_1724;
      if (var1 != null && Iiiilllliiilll.field_1687 != null) {
         if (var1 != this.IIIiiIIllIIiiIIl) {
            if (this.IIIiiIIllIIiiIIl != null) {
               iillIlllIIilIlll.lIiiIiIlilli(this);
            }

            this.IIIiiIIllIIiiIIl = var1;
            this.iIIiiIIlIlIiiIIl = 0;
         }

         this.iIIiiIIlIlIiiIIl = var1.method_24828() ? Math.min(this.iIIiiIIlIlIiiIIl + 1, 1000) : 0;
         this.IliliIIllliliIIl = this.lIIlliIIll(var1)
            ? new IIIIIIIllIIIIIIl(
               var1.method_5628(),
               this.lllliIIlillliIIl.Iilllilliill(),
               illllIlIilllIl.Ililllililil(this.iIIiiIIlIlIiiIIl),
               this.IilliIIllilliIIl.Iilllilliill(),
               this.IilliIIllilliIIl.Ililllililil(),
               this.iilliIIlIIiliIIl.Iilllilliill(),
               this.iilliIIlIIiliIIl.Ililllililil()
            )
            : null;
         this.ilIllIiIll(var1);
      } else {
         this.IliliIIllliliIIl = null;
      }
   }

   public Illlilllli() {
      super(IliIlllilIi<"IliIlllilIi","Br45V7Xxb6IioGSzTeFPDggm88QuGGbBStOvZtLZyafl9dXQHvOlyzmi0A==">(), lllIllillIll.iiIlIIIiIIllIIIi);
      this.IilliIIllilliIIl = new Iiiliillliiliill(
         IliIlllilIi<"IliIlllilIi","NRDxLsFDi2LNwX69kA+QyvkvkPdQZDGz2exOfD5og0+zxMhHpQ==">(),
         IliIlllilIi<"IliIlllilIi","2PoFqXkgjNsgf+7hD/IEvLm8o1WF2hO2KeCwx5uEJEUtcXpZA4EBBTk4UyGHS4ggAKT6aQGi/yaHzlF2ryPMEGdLOTQkao+syQeDbEfhvqVm4I1U+l9dmyRdhPJtMC25">(),
         50.0,
         100.0,
         0.0,
         500.0,
         10.0
      );
      this.iilliIIlIIiliIIl = new Iiiliillliiliill(
         IliIlllilIi<"IliIlllilIi","9jkBOUSPAIHQU9u69sZlZ5iyA6giNZGmrQvl9WR8AsuBAc3UN/nujg==">(),
         IliIlllilIi<"IliIlllilIi","P+PCHYmdybnvTB5pFi4j9lkgHdATHbl2xoxk0isruOakWL19FEFbDUQMtGsoqxx6nTLOXI6pA1W3v08448gkotL7IvmB45TGicaksmYsE/0ctucLjCOS2jK0y2b6oMY=">(),
         200.0,
         250.0,
         0.0,
         500.0,
         10.0
      );
      this.lIiliIIliIiliIIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","S8uF1cATLm/HBZOaGApvE7H/RozMewPH3XJhCEXoIzXYysutQRf0">(),
         IliIlllilIi<"IliIlllilIi","kRcJmEUriVaB3MAuLgfhUk5xe203UXn91oLK7gQNlbrw3/fQI7pTo/dmFnAP/pEisFFfyEgHFVEjIbKXFpC21Yg859EnQCLT">(),
         false
      );
      this.ililiIIlIiiliIIl = -1L;
      this.liiliIIliiiliIIl = -1L;
      this.llIiiIIlilIiiIIl = -1L;
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lllliIIlillliIIl, this.IilliIIllilliIIl, this.iilliIIlIIiliIIl, this.lIiliIIliIiliIIl});
   }

   private void liIlliiIll() {
      this.IliliIIllliliIIl = null;
      this.ililiIIlIiiliIIl = -1L;
      this.liiliIIliiiliIIl = -1L;
      this.IIIiiIIllIIiiIIl = null;
      this.iIIiiIIlIlIiiIIl = 0;
      this.llIiiIIlilIiiIIl = -1L;
      this.IiIiiIIlliIiiIIl = false;
      this.iiIiiIIlIIliiIIl = false;
   }

   @Override
   protected void Illillliilli() {
      this.liIlliiIll();
   }

   private boolean lIIlliIIll(class_746 player) {
      if (this.lllliIIlillliIIl.Iilllilliill() <= 0) {
         return false;
      } else {
         return this.lIiliIIliIiliIIl.Iilllilliill() && player.method_5799() ? false : this.IlIllllIll(player);
      }
   }
}
