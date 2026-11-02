package gg.corz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.minecraft.class_1297;
import net.minecraft.class_1646;
import net.minecraft.class_243;
import net.minecraft.class_310;

public final class IiIiiilliIiiil {
   private static final class_310 iIllillliIlllillli = class_310.method_1551();
   private static final long llllillliilllillli = 600L;
   private final Map<UUID, lilIiIiliilIiIil> Iillilllilillillli = new HashMap<>();

   public List<lilIiIiliilIiIil> lIiiIiIlilli() {
      return new ArrayList<>(this.Iillilllilillillli.values());
   }

   public lilIiIiliilIiIil IilliliilIIi(UUID uuid) {
      return this.Iillilllilillillli.computeIfAbsent(uuid, lilIiIiliilIiIil::new);
   }

   public int IIIllIIliIIl() {
      return this.Iillilllilillillli.size();
   }

   public void IliIlllilIi(long range, double tick) {
      if (iIllillliIlllillli.field_1687 != null && iIllillliIlllillli.field_1724 != null) {
         double var5 = tick * tick;

         for (class_1297 var8 : iIllillliIlllillli.field_1687.method_18112()) {
            if (var8 instanceof class_1646) {
               class_1646 var9 = (class_1646)var8;
               if (var9.method_5805() && !var9.method_31481() && !(var9.method_5858(iIllillliIlllillli.field_1724) > var5)) {
                  this.Iillilllilillillli.computeIfAbsent(var9.method_5667(), lilIiIiliilIiIil::new).IliIlllilIi(var9, range);
               }
            }
         }

         this.Iillilllilillillli.values().removeIf(i -> range - i.llIiillIil > 600L);
      }
   }

   public lilIiIiliilIiIil iIlIlllllill(UUID uuid) {
      return uuid == null ? null : this.Iillilllilillillli.get(uuid);
   }

   public List<lilIiIiliilIiIil> iliIiiliiiii() {
      List var1 = this.lIiiIiIlilli();
      class_243 var2 = iIllillliIlllillli.field_1724 != null ? iIllillliIlllillli.field_1724.method_73189() : class_243.field_1353;
      var1.sort((a, p) -> Double.compare(a.IlilillIil.method_1025(var2), p.IlilillIil.method_1025(var2)));
      return var1;
   }

   public class_1646 liiiIIllIl(UUID uuid) {
      if (iIllillliIlllillli.field_1687 != null && uuid != null) {
         lilIiIiliilIiIil var2 = this.Iillilllilillillli.get(uuid);
         if (var2 != null && iIllillliIlllillli.field_1687.method_8469(var2.iIilillIil) instanceof class_1646 var4 && uuid.equals(var4.method_5667())) {
            return var4;
         } else if (iIllillliIlllillli.field_1687.method_66347(uuid) instanceof class_1646 var6) {
            if (var2 != null) {
               var2.iIilillIil = var6.method_5628();
            }

            return var6;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public void IlIlllIlilIl() {
      this.Iillilllilillillli.clear();
   }
}
