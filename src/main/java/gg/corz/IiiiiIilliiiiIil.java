package gg.corz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import net.minecraft.class_310;
import net.minecraft.class_640;

public final class IiiiiIilliiiiIil {
   private Set<UUID> iiIIiilIil;
   private static final long IiIIiilIil = 2000L;
   private final Map<UUID, liIlIliiiIlIli> liIIiilIil = new HashMap<>();

   public Set<String> lIiiIiIlilli(class_310 mc) {
      HashSet var2 = new HashSet();
      if (mc.method_1562() == null) {
         return var2;
      } else {
         for (class_640 var4 : mc.method_1562().method_2880()) {
            if (var4.method_2966() != null && var4.method_2966().name() != null) {
               var2.add(var4.method_2966().name().toLowerCase(Locale.ROOT));
            }
         }

         return var2;
      }
   }

   public void iliIiiliiiii() {
      this.liIIiilIil.clear();
      this.iiIIiilIil = Set.of();
   }

   public List<llIiIlIiilIiIlIi> IliIlllilIi(class_310 mc, long timeMs) {
      if (mc.field_1724 != null && mc.method_1562() != null) {
         HashSet var4 = new HashSet();

         for (class_640 var6 : mc.method_1562().method_45732()) {
            if (var6 != null && var6.method_2966() != null && var6.method_2966().id() != null) {
               UUID var7 = var6.method_2966().id();
               if (!var7.equals(mc.field_1724.method_5667())) {
                  var4.add(var7);
                  String var8 = var6.method_2966().name();
                  liIlIliiiIlIli var9 = this.liIIiilIil.get(var7);
                  boolean var10 = IIIllIIliIIl(var8) || lllIIIIiillIIIIi.iiiIlIIIll(var7, var8) || var9 != null && var9.iiilIIIIIl;
                  this.liIIiilIil.put(var7, var9 == null ? new liIlIliiiIlIli(var8, timeMs, var10) : new liIlIliiiIlIli(var8, var9.liilIIIIIl, var10));
               }
            }
         }

         ArrayList var11 = new ArrayList();

         for (UUID var13 : this.iiIIiilIil) {
            if (!var4.contains(var13)) {
               liIlIliiiIlIli var14 = this.liIIiilIil.get(var13);
               if (var14 != null && var14.iiilIIIIIl && timeMs - var14.liilIIIIIl >= 2000L) {
                  var11.add(new llIiIlIiilIiIlIi(var13, var14.IiilIIIIIl));
               }
            }
         }

         this.iiIIiilIil = Set.copyOf(var4);
         if (this.liIIiilIil.size() > 1024) {
            this.liIIiilIil.keySet().retainAll(var4);
         }

         return var11;
      } else {
         return List.of();
      }
   }

   public boolean liiiIIllIl(UUID id) {
      liIlIliiiIlIli var2 = this.liIIiilIil.get(id);
      return var2 != null && var2.iiilIIIIIl;
   }

   public IiiiiIilliiiiIil() {
      this.iiIIiilIil = Set.of();
   }

   public String iIlIlllllill(UUID id) {
      liIlIliiiIlIli var2 = this.liIIiilIil.get(id);
      return var2 == null ? null : var2.IiilIIIIIl;
   }

   public UUID IilliliilIIi(String name) {
      if (name == null) {
         return null;
      } else {
         for (Entry var3 : this.liIIiilIil.entrySet()) {
            if (((liIlIliiiIlIli)var3.getValue()).IiilIIIIIl.equalsIgnoreCase(name)) {
               return (UUID)var3.getKey();
            }
         }

         return null;
      }
   }

   public static boolean IIIllIIliIIl(String name) {
      if (name == null) {
         return false;
      } else {
         for (String var4 : lllIIIIiillIIIIi.liIIiiIiil) {
            if (var4 != null && var4.equalsIgnoreCase(name.trim())) {
               return true;
            }
         }

         return false;
      }
   }
}
