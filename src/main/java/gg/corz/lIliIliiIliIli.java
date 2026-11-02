package gg.corz;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.class_2338;
import net.minecraft.class_638;

public final class lIliIliiIliIli {
   private volatile List<IiiiIlliiiIl> IliiIlIIIl;
   private final Map<String, IiiiIlliiiIl> iIiiIlIIIl = new LinkedHashMap<>();

   public synchronized void Iilllilliill(JsonElement element) {
      this.iIiiIlIIIl.clear();
      if (element != null && element.isJsonArray()) {
         for (JsonElement var3 : element.getAsJsonArray()) {
            try {
               JsonObject var4 = var3.getAsJsonObject();
               long var5 = var4.get(IIillIiliIil<"IIillIiliIil","0iqbM5o+ZNtrNTkV5o5Wist+QTMqZpO25PoNSYKJMA==">()).getAsLong();
               String var7 = var4.get(IIillIiliIil<"IIillIiliIil","zGb4GKlxT/3EzkKR5YdnJna1EUuOBDhDMnUUHgt70g==">()).getAsString();
               IliliIllliliIl var8 = IliliIllliliIl.valueOf(
                  var4.get(IIillIiliIil<"IIillIiliIil","XiOfrqeKqEVxnE+6mB1LfkJXroJM1OfHp5Cp6IHBmXQ=">()).getAsString()
               );
               this.iIiiIlIIIl.put(IliIlllilIi(var7, var5), new IiiiIlliiiIl(var5, var7, var8));
            } catch (Exception var9) {
            }
         }
      }

      this.IiIlliIliiIl();
   }

   public List<IiiiIlliiiIl> IlIlllIlilIl() {
      return this.IliiIlIIIl;
   }

   public lIliIliiIliIli() {
      this.IliiIlIIIl = List.of();
   }

   public synchronized List<IiiiIlliiiIl> IIlllIlliIll(class_638 world) {
      if (world == null) {
         return List.of();
      } else {
         String var2 = world.method_27983().method_29177().toString();
         ArrayList var3 = null;
         Iterator var4 = this.iIiiIlIIIl.entrySet().iterator();

         while (var4.hasNext()) {
            IiiiIlliiiIl var5 = (IiiiIlliiiIl)((Entry)var4.next()).getValue();
            if (var5.IilliliilIIi().equals(var2)) {
               class_2338 var6 = var5.liiiIIllIl();
               if (world.method_8393(var6.method_10263() >> 4, var6.method_10260() >> 4)
                  && IliliIllliliIl.IliIlllilIi(world.method_8320(var6).method_26204()) == null) {
                  var4.remove();
                  if (var3 == null) {
                     var3 = new ArrayList();
                  }

                  var3.add(var5);
               }
            }
         }

         if (var3 == null) {
            return List.of();
         } else {
            this.IiIlliIliiIl();
            return var3;
         }
      }
   }

   public synchronized boolean iIlIlllllill(class_2338 type, String pos, IliliIllliliIl dimension) {
      long var6 = -1512621006510763136L;
      String var4 = IliIlllilIi(pos, type.method_10063());
      var6 ^= ((long)(!this.iIiiIlIIIl.containsKey(var4) ? 1 : 0) << 32 ^ var6) & -1L << 32;
      this.iIiiIlIIIl.put(var4, IiiiIlliiiIl.IliIlllilIi(type, pos, dimension));
      this.IiIlliIliiIl();
      return (boolean)((int)(var6 >>> 32));
   }

   public synchronized JsonElement Illlllllilll() {
      JsonArray var1 = new JsonArray();

      for (IiiiIlliiiIl var3 : this.iIiiIlIIIl.values()) {
         JsonObject var4 = new JsonObject();
         var4.addProperty(IIillIiliIil<"IIillIiliIil","0iqbM5o+ZNtrNTkV5o5Wist+QTMqZpO25PoNSYKJMA==">(), var3.iIlIlllllill());
         var4.addProperty(IIillIiliIil<"IIillIiliIil","zGb4GKlxT/3EzkKR5YdnJna1EUuOBDhDMnUUHgt70g==">(), var3.IilliliilIIi());
         var4.addProperty(IIillIiliIil<"IIillIiliIil","XiOfrqeKqEVxnE+6mB1LfkJXroJM1OfHp5Cp6IHBmXQ=">(), var3.lIiiIiIlilli().name());
         var1.add(var4);
      }

      return var1;
   }

   public synchronized void iliIiiliiiii() {
      this.iIiiIlIIIl.clear();
      this.IiIlliIliiIl();
   }

   private void IiIlliIliiIl() {
      this.IliiIlIIIl = List.copyOf(this.iIiiIlIIIl.values());
   }

   private static String IliIlllilIi(String pos, long dimension) {
      return pos + IIillIiliIil<"IIillIiliIil","RyBwdu9Zzg1pWuyPSF7pUEKvZSxGjm+WElGhNq8=">() + dimension;
   }

   public synchronized boolean IilliliilIIi(class_2338 pos, String dimension) {
      if (this.iIiiIlIIIl.remove(IliIlllilIi(dimension, pos.method_10063())) != null) {
         this.IiIlliIliiIl();
         return true;
      } else {
         return false;
      }
   }

   public synchronized boolean lIiiIiIlilli(class_2338 pos, String dimension) {
      return this.iIiiIlIIIl.containsKey(IliIlllilIi(dimension, pos.method_10063()));
   }

   public synchronized boolean liiiIIllIl(class_2338 type, String pos, IliliIllliliIl dimension) {
      String var4 = IliIlllilIi(pos, type.method_10063());
      if (this.iIiiIlIIIl.remove(var4) != null) {
         this.IiIlliIliiIl();
         return false;
      } else {
         this.iIiiIlIIIl.put(var4, IiiiIlliiiIl.IliIlllilIi(type, pos, dimension));
         this.IiIlliIliiIl();
         return true;
      }
   }

   public synchronized int IIIllIIliIIl() {
      return this.iIiiIlIIIl.size();
   }
}
