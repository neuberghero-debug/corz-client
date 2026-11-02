package gg.corz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.class_1792;
import net.minecraft.class_243;

public final class IIilIlIllIilIlIl {
   private static double IiIlliIliiIl(liIlIiiliiIlIiil playerPos, class_243 c) {
      return playerPos.IliIlllilIi().IlilillIil.method_1025(c == null ? class_243.field_1353 : c);
   }

   public static boolean liiiIIllIl(IiIlIIiliIlIIi t, lIllIilliIllIill ignoreCost, boolean tr) {
      if (t != null && ignoreCost != null) {
         switch (t.IIIiiIililIIiiIili) {
            case IilIliilIl:
               if (!tr && !iIlIlllllill(t, ignoreCost)) {
                  return false;
               } else {
                  return switch (t.iIIiiIiliIlIiiIili) {
                     case IliIIilllliIIill -> ignoreCost.IlIiIilill
                     && ignoreCost.llIiIilill != null
                     && IliiiiIilliiiiIi.iIlIlllllill(ignoreCost.llIiIilill, t.IiIiiIililiIiiIili)
                     && ignoreCost.IiIiIilill >= Math.max(1, t.iiIiiIiliIIliiIili);
                     case iliIIillIiiIIill -> ignoreCost.iIIiIilill;
                     case liiIIilliiiIIill -> ignoreCost.lIilIilill == IiiIlliiIl.iIlIlllllill(t.lIliiIiliiIliiIili);
                  };
               }
            case iilIliilIl:
               if (!ignoreCost.iIIiIilill) {
                  return false;
               }

               class_1792 var3 = IiiIlliiIl.iIlIlllllill(t.lIliiIiliiIliiIili);
               return var3 != null && (ignoreCost.illlIilill == var3 || ignoreCost.lillIilill == var3);
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public static boolean IilliliilIIi(lilIiIiliilIiIil v, IiIlIIiliIlIIi t) {
      return v != null && lIIllilliIIllill.IilliliilIIi(v.ililillIil, t.llIiiIiliilIiiIili);
   }

   public static liIlIiiliiIlIiil IIIllIIliIIl(List<liIlIiiliiIlIiil> cands, liliIllliiliIlll mode, class_243 roundRobin, int playerPos) {
      if (cands != null && !cands.isEmpty()) {
         if (cands.size() == 1) {
            return (liIlIiiliiIlIiil)cands.get(0);
         } else {
            return switch (mode) {
               case liliIlIill -> IIlllIlliIll(cands, c -> (double)(-c.liiiIIllIl().lIIiIilill));
               case IIiiIlIill -> IIlllIlliIll(cands, c -> -IiIlliIliiIl(c, roundRobin));
               case lIiiIlIill -> IIlllIlliIll(cands, c -> (double)c.liiiIIllIl().liiiIIllIl());
               case iIiiIlIill -> (liIlIiiliiIlIiil)cands.get(Math.floorMod(playerPos, cands.size()));
               case IiliIlIill -> IIlllIlliIll(cands, c -> (double)(-c.liiiIIllIl().lIIiIilill));
               case iiliIlIill -> IIlllIlliIll(cands, c -> IlIlllIlilIl(c, roundRobin));
            };
         }
      } else {
         return null;
      }
   }

   public static boolean iIlIlllllill(IiIlIIiliIlIIi tr, lIllIilliIllIill t) {
      return tr.IIIiiIililIIiiIili != llIlIlIlilIlIlIl.IilIliilIl || tr.IlliiIilillliiIili <= 0 || t.lIIiIilill <= tr.IlliiIilillliiIili;
   }

   public static List<liIlIiiliiIlIiil> iliIiiliiiii(Collection<lilIiIiliilIiIil> t, IiIlIIiliIlIIi villagers, Predicate<lilIiIiliilIiIil> usable) {
      ArrayList var3 = new ArrayList();

      for (lilIiIiliilIiIil var5 : t) {
         if (usable == null || usable.test(var5)) {
            lIllIilliIllIill var6 = lIiiIiIlilli(var5, villagers);
            if (var6 != null) {
               var3.add(new liIlIiiliiIlIiil(var5, var6));
            }
         }
      }

      return var3;
   }

   private static liIlIiiliiIlIiil IIlllIlliIll(List<liIlIiiliiIlIiil> cands, IlIlllilllIlllil s) {
      liIlIiiliiIlIiil var2 = null;
      double var3 = Double.NEGATIVE_INFINITY;

      for (liIlIiiliiIlIiil var6 : cands) {
         double var7 = s.of(var6);
         if (var7 > var3) {
            var3 = var7;
            var2 = var6;
         }
      }

      return var2;
   }

   public static double IlIlllIlilIl(liIlIiiliiIlIiil playerPos, class_243 c) {
      lIllIilliIllIill var2 = playerPos.liiiIIllIl();
      double var3 = (double)var2.lIIiIilill * 3.0;
      double var5 = Math.sqrt(IiIlliIliiIl(playerPos, c)) * 0.8;
      double var7 = (double)Math.min(var2.liiiIIllIl(), 16) * 1.5;
      double var9 = var2.IiilIilill < 0 ? (double)(-var2.IiilIilill) * 2.0 : 0.0;
      return var7 + var9 - var3 - var5;
   }

   public static lIllIilliIllIill lIiiIiIlilli(lilIiIiliilIiIil v, IiIlIIiliIlIIi t) {
      if (!IilliliilIIi(v, t)) {
         return null;
      } else {
         lIllIilliIllIill var2 = null;

         for (lIllIilliIllIill var4 : v.lIIiillIil) {
            if (IliIlllilIi(t, var4)) {
               if (var2 == null) {
                  var2 = var4;
               } else if (t.IIIiiIililIIiiIili == llIlIlIlilIlIlIl.IilIliilIl) {
                  if (var4.lIIiIilill < var2.lIIiIilill) {
                     var2 = var4;
                  }
               } else if (var4.iIilIilill > var2.iIilIilill) {
                  var2 = var4;
               }
            }
         }

         return var2;
      }
   }

   public static boolean IliIlllilIi(IiIlIIiliIlIIi tr, lIllIilliIllIill t) {
      return t != null && t.iIlIlllllill() && liiiIIllIl(tr, t, false);
   }

   private IIilIlIllIilIlIl() {
   }
}
