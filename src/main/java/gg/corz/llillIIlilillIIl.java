package gg.corz;

import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;

public record llillIIlilillIIl(
   class_2338 base,
   class_2338 obsidianCell,
   class_2350 face,
   boolean hold,
   boolean breakNow,
   boolean trustObsidian,
   class_243 targetFeetAt,
   class_238 targetBoxAt,
   class_2338 support,
   class_2350 supportFace
) {
   private final boolean lIIiiillIl;
   private final class_2338 ilIiiillIl;
   private final class_2350 IiIiiillIl;
   private final class_2338 IiiliillIl;
   private final class_2338 liiliillIl;
   private final class_243 IlIiiillIl;
   private final class_238 llIiiillIl;
   private final boolean iIIiiillIl;
   private final boolean IIIiiillIl;
   private final class_2350 iiiliillIl;

   public llillIIlilillIIl(
      class_2338 targetFeetAt,
      class_2338 base,
      class_2350 obsidianCell,
      boolean trustObsidian,
      boolean face,
      boolean breakNow,
      class_243 hold,
      class_238 targetBoxAt
   ) {
      this(targetFeetAt, base, obsidianCell, trustObsidian, face, breakNow, hold, targetBoxAt, null, null);
   }

   public boolean iliIiiliiiii() {
      return this.iIIiiillIl;
   }

   public boolean lIiiIiIlilli() {
      return this.lIIiiillIl;
   }

   public class_2338 IiIlliIliiIl() {
      return this.ilIiiillIl;
   }

   public class_2350 IIlllIlliIll() {
      return this.IiIiiillIl;
   }

   public boolean IilliliilIIi() {
      return this.IIIiiillIl;
   }

   public llillIIlilillIIl(
      class_2338 base,
      class_2338 obsidianCell,
      class_2350 face,
      boolean hold,
      boolean breakNow,
      boolean trustObsidian,
      class_243 targetFeetAt,
      class_238 targetBoxAt,
      class_2338 support,
      class_2350 supportFace
   ) {
      this.IiiliillIl = base;
      this.liiliillIl = obsidianCell;
      this.iiiliillIl = face;
      this.IIIiiillIl = hold;
      this.lIIiiillIl = breakNow;
      this.iIIiiillIl = trustObsidian;
      this.IlIiiillIl = targetFeetAt;
      this.llIiiillIl = targetBoxAt;
      this.ilIiiillIl = support;
      this.IiIiiillIl = supportFace;
   }

   public class_243 IIIllIIliIIl() {
      return this.IlIiiillIl;
   }

   public class_2338 IliIlllilIi() {
      return this.IiiliillIl;
   }

   public class_238 IlIlllIlilIl() {
      return this.llIiiillIl;
   }

   public class_2338 liiiIIllIl() {
      return this.liiliillIl;
   }

   public class_2350 iIlIlllllill() {
      return this.iiiliillIl;
   }
}
