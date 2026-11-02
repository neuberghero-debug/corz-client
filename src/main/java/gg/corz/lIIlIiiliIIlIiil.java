package gg.corz;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.Comparator;

public final class lIIlIiiliIIlIiil {
   private final iiIIIiilIIlIIiil[] lllIiillil;

   public void lIiiIiIlilli(float out, float[] time, int offset) {
      int var4 = 0;
      int var5 = this.lllIiillil.length;

      while (var4 < var5) {
         int var6 = var4 + var5 >>> 1;
         if (this.lllIiillil[var6].IIiiIillil <= out) {
            var4 = var6 + 1;
         } else {
            var5 = var6;
         }
      }

      if (var4 == 0) {
         System.arraycopy(this.lllIiillil[0].lIiiIillil, 0, time, offset, 3);
      } else {
         iiIIIiilIIlIIiil var14 = this.lllIiillil[var4 - 1];
         if (var4 == this.lllIiillil.length) {
            System.arraycopy(var14.iIiiIillil, 0, time, offset, 3);
         } else {
            iiIIIiilIIlIIiil var7 = this.lllIiillil[var4];
            float var8 = (out - var14.IIiiIillil) / (var7.IIiiIillil - var14.IIiiIillil);

            for (int var9 = 0; var9 < 3; var9++) {
               float var10 = var14.iIiiIillil[var9];
               float var11 = var7.lIiiIillil[var9];
               if (!var14.IliiIillil && !var7.IliiIillil) {
                  time[offset + var9] = var10 + (var11 - var10) * var8;
               } else {
                  float var12 = this.lllIiillil[Math.max(0, var4 - 2)].iIiiIillil[var9];
                  float var13 = this.lllIiillil[Math.min(this.lllIiillil.length - 1, var4 + 1)].lIiiIillil[var9];
                  time[offset + var9] = 0.5F
                     * (
                        2.0F * var10
                           + (-var12 + var11) * var8
                           + (2.0F * var12 - 5.0F * var10 + 4.0F * var11 - var13) * var8 * var8
                           + (-var12 + 3.0F * var10 - 3.0F * var11 + var13) * var8 * var8 * var8
                     );
               }
            }
         }
      }
   }

   public float[] IilliliilIIi() {
      float[] var1 = new float[this.lllIiillil.length];

      for (int var2 = 0; var2 < this.lllIiillil.length; var2++) {
         var1[var2] = this.lllIiillil[var2].IIiiIillil;
      }

      return var1;
   }

   public static lIIlIiiliIIlIiil IliIlllilIi(JsonElement value) {
      if (!value.isJsonObject()) {
         return new lIIlIiiliIIlIiil(new iiIIIiilIIlIIiil[]{new iiIIIiilIIlIIiil(0.0F, iliIiiliiiii(value), iliIiiliiiii(value), false)});
      } else {
         JsonObject var1 = value.getAsJsonObject();
         if (!var1.has(IIlllIlliIll<"IIlllIlliIll","fOgxMM1uA6vXBv9MyKLB0c0Nh3o8H2QlpSlBWcBiK3g=">())
            && !var1.has(IIlllIlliIll<"IIlllIlliIll","Hoda0akFK1WvBaRjWLJ36Lo3bTHNTn8uWGaqzoTY6Q==">())) {
            if (var1.size() != 0 && var1.size() <= 4096) {
               ArrayList var2 = new ArrayList();
               var1.entrySet().forEach(keys -> var2.add(liiiIIllIl(IIIllIIliIIl(new JsonPrimitive((String)keys.getKey())), (JsonElement)keys.getValue())));
               var2.sort(Comparator.comparingDouble(iiIIIiilIIlIIiil::IliIlllilIi));
               float var3 = -1.0F;

               for (iiIIIiilIIlIIiil var5 : var2) {
                  if (var5.IIiiIillil < 0.0F || var5.IIiiIillil > 300.0F || var5.IIiiIillil <= var3) {
                     throw new IllegalArgumentException(IIlllIlliIll<"IIlllIlliIll","2s6l0qtpRZewXrzeBpCpX53tYDsmBfRUCKbLhg5ABSehUZCRv2WtY5TV6CbWvPFsRu0=">());
                  }

                  var3 = var5.IIiiIillil;
               }

               return new lIIlIiiliIIlIiil(var2.toArray(iiIIIiilIIlIIiil[]::new));
            } else {
               throw new IllegalArgumentException(IIlllIlliIll<"IIlllIlliIll","ky4+FbFarhzFL2CxC9WeXwcD3CMseZzwehYdYp7szxXWv3lQJm+ZNKVaDhsxQNKbL8j5WxfMOZM=">());
            }
         } else {
            return new lIIlIiiliIIlIiil(new iiIIIiilIIlIIiil[]{liiiIIllIl(0.0F, var1)});
         }
      }
   }

   private static iiIIIiilIIlIIiil liiiIIllIl(float value, JsonElement time) {
      if (!time.isJsonObject()) {
         float[] var6 = iliIiiliiiii(time);
         return new iiIIIiilIIlIIiil(value, var6, var6, false);
      } else {
         JsonObject var2 = time.getAsJsonObject();
         JsonElement var3 = var2.has(IIlllIlliIll<"IIlllIlliIll","Hoda0akFK1WvBaRjWLJ36Lo3bTHNTn8uWGaqzoTY6Q==">())
            ? var2.get(IIlllIlliIll<"IIlllIlliIll","Hoda0akFK1WvBaRjWLJ36Lo3bTHNTn8uWGaqzoTY6Q==">())
            : var2.get(IIlllIlliIll<"IIlllIlliIll","fOgxMM1uA6vXBv9MyKLB0c0Nh3o8H2QlpSlBWcBiK3g=">());
         JsonElement var4 = var2.has(IIlllIlliIll<"IIlllIlliIll","fOgxMM1uA6vXBv9MyKLB0c0Nh3o8H2QlpSlBWcBiK3g=">())
            ? var2.get(IIlllIlliIll<"IIlllIlliIll","fOgxMM1uA6vXBv9MyKLB0c0Nh3o8H2QlpSlBWcBiK3g=">())
            : var3;
         String var5 = var2.has(IIlllIlliIll<"IIlllIlliIll","9hgQU6yTWRfDKsm+0WB87YXDUdqQmsNJ/wWIQZ0kTHm7nkSQEw==">())
            ? var2.get(IIlllIlliIll<"IIlllIlliIll","9hgQU6yTWRfDKsm+0WB87YXDUdqQmsNJ/wWIQZ0kTHm7nkSQEw==">()).getAsString()
            : IIlllIlliIll<"IIlllIlliIll","bw6XRGzLwFvpISEA4GOH1ZUSsRDxNcA+jGMnz+MvRPVbMg==">();
         if (!var5.equals(IIlllIlliIll<"IIlllIlliIll","bw6XRGzLwFvpISEA4GOH1ZUSsRDxNcA+jGMnz+MvRPVbMg==">())
            && !var5.equals(IIlllIlliIll<"IIlllIlliIll","HYZFaWwlNLUHXe0uf0wowPLpWlfWnF2GuoIjS42CFXljiSBL3hY=">())) {
            throw new IllegalArgumentException(
               IIlllIlliIll<"IIlllIlliIll","RYdUUXlyjzYSqz0ABoa+oVB1UNIDOi4etWZP3L9WtwHQgFYANTwgqFcB1Q00/yHkWR5YghiK3Q==">() + var5
            );
         } else {
            return new iiIIIiilIIlIIiil(
               value,
               iliIiiliiiii(var3),
               iliIiiliiiii(var4),
               var5.equals(IIlllIlliIll<"IIlllIlliIll","HYZFaWwlNLUHXe0uf0wowPLpWlfWnF2GuoIjS42CFXljiSBL3hY=">())
            );
         }
      }
   }

   static float IIIllIIliIIl(JsonElement value) {
      float var1 = value.getAsFloat();
      if (Float.isFinite(var1) && !(Math.abs(var1) > 100000.0F)) {
         return var1;
      } else {
         throw new IllegalArgumentException(
            IIlllIlliIll<"IIlllIlliIll","Hi7gsXVVVt9DP6Ex00XZ5X/PBT1/i7RNea9mXCVLQRrpjij9Szf9SOVEUwY2YYs/C8CHmKb4aYpmgp1oPmw=">()
         );
      }
   }

   static float[] iliIiiliiiii(JsonElement value) {
      if (value == null) {
         throw new IllegalArgumentException(IIlllIlliIll<"IIlllIlliIll","ZXyezlFxpvHPeSjewk8orvX8U3ejXjjti65WJW5XlG0eygqaC/bs4wed">());
      } else if (value.isJsonArray()) {
         JsonArray var2 = value.getAsJsonArray();
         if (var2.size() != (-1045510712 - -45 ^ -57 ^ 1045510705)) {
            throw new IllegalArgumentException(IIlllIlliIll<"IIlllIlliIll","UTUVsOYDLDBK+Si5lXkca9cotfoXebx8KRXgJEe0Jk+mj6OpGogPmOQQP7BErUw=">());
         } else {
            return new float[]{IIIllIIliIIl(var2.get(0)), IIIllIIliIIl(var2.get(1)), IIIllIIliIIl(var2.get(2))};
         }
      } else {
         float var1 = IIIllIIliIIl(value);
         return new float[]{var1, var1, var1};
      }
   }

   public float iIlIlllllill() {
      return this.lllIiillil[this.lllIiillil.length - 1].IIiiIillil;
   }

   private lIIlIiiliIIlIiil(iiIIIiilIIlIIiil[] keys) {
      this.lllIiillil = keys;
   }
}
